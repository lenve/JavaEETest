package org.sang.db;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sang on 17-1-16.
 */
@MappedTypes(List.class)
@MappedJdbcTypes({JdbcType.VARCHAR})
public class MyListTypeHandler extends BaseTypeHandler<List<String>> {
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, List<String> strings, JdbcType jdbcType) throws SQLException {
        //1.List集合转字符串
        StringBuffer sb = new StringBuffer();
        for (String string : strings) {
            sb.append(string).append(",");
        }
        //2.设置给ps
        preparedStatement.setString(i, sb.toString().substring(0, sb.toString().length() - 1));
    }

    public List<String> getNullableResult(ResultSet resultSet, String s) throws SQLException {
        String[] split = resultSet.getString(s).split(",");
        return Arrays.asList(split);
    }

    public List<String> getNullableResult(ResultSet resultSet, int i) throws SQLException {
        String[] split = resultSet.getString(i).split(",");
        return Arrays.asList(split);
    }

    public List<String> getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        String[] split = callableStatement.getString(i).split(",");
        return Arrays.asList(split);
    }
}

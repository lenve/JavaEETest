package org.sang;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.sang.bean.User;
import org.sang.db.DBUtils;
import org.sang.db.UserMapper;

/**
 * Created by sang on 17-1-14.
 */
public class Main {

    @Test
    public void test1() {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            //查询同一条数据时会缓存
            User user = mapper.getUser(1l);
            User user2 = mapper.getUser(1l);
            System.out.println(user.toString());
            System.out.println(user2.toString());
            sqlSession.commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            sqlSession.rollback();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void test2() {
        SqlSession sqlSession = null;
        SqlSession sqlSession2 = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = mapper.getUser(1l);
            System.out.println(user.toString());
            sqlSession.commit();
            sqlSession2 = DBUtils.openSqlSession();
            UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
            User user2 = mapper2.getUser(1l);
            System.out.println(user2.toString());
            sqlSession2.commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            sqlSession.rollback();
            sqlSession2.rollback();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
            if (sqlSession2 != null) {
                sqlSession2.close();
            }
        }
    }
}

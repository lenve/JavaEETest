package org.sang.db;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;

/**
 * Created by sang on 17-1-13.
 */
public class DBUtils {
    private static SqlSessionFactory sqlSessionFactory = null;
    private static final Class CLASS_LOCK = DBUtils.class;

    public static SqlSessionFactory initSqlSessionFactory() {
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-conf.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        synchronized (CLASS_LOCK) {
            if (sqlSessionFactory == null) {
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            }
        }
        return sqlSessionFactory;
    }

    public static SqlSession openSqlSession() {
        if (sqlSessionFactory == null)
            initSqlSessionFactory2();
        return sqlSessionFactory.openSession();
    }

    public static SqlSessionFactory initSqlSessionFactory2() {
        InputStream cfgStream = null;
        Reader cfgReader = null;
        InputStream proStream = null;
        Reader proReader = null;
        Properties properties = null;
        try {
            cfgStream = Resources.getResourceAsStream("mybatis-conf.xml");
            cfgReader = new InputStreamReader(cfgStream);
            proStream = Resources.getResourceAsStream("db.properties");
            proReader = new InputStreamReader(proStream);
            properties = new Properties();
            properties.load(proReader);
            //获取密文用户名和密码
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            //解密
            properties.setProperty("username", username.substring(0, username.indexOf("-")));
            properties.setProperty("password", password.substring(0, password.indexOf("-")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        synchronized (CLASS_LOCK) {
            if (sqlSessionFactory == null) {
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(cfgReader,properties);
            }
        }
        return sqlSessionFactory;
    }
}

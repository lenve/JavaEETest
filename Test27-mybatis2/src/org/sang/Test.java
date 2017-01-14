package org.sang;

import org.apache.ibatis.session.SqlSession;
import org.sang.bean.User;
import org.sang.db.DBUtils;
import org.sang.db.UserMapper;

/**
 * Created by sang on 17-1-13.
 */
public class Test {

    @org.junit.Test
    public void test2() {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUser(3l);
            System.out.println(user.toString());
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @org.junit.Test
    public void test3() {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            User user = (User) sqlSession.selectOne("org.sang.db.UserMapper.getUser", 1l);
            System.out.println(user.toString());
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
    @org.junit.Test
    public void test4() {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            User user = (User) sqlSession.selectOne("getUser", 1l);
            System.out.println(user.toString());
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}

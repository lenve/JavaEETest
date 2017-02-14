package org.sang;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.sang.bean.User;
import org.sang.db.DBUtils;
import org.sang.db.UserMapper;

import java.util.ArrayList;
import java.util.List;

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
            List<User> list = mapper.getUser("西安");
            for (User user : list) {
                System.out.println(user);
            }
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
        try {
            sqlSession = DBUtils.openSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> list = mapper.getUser("");
            for (User user : list) {
                System.out.println(user);
            }
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
    public void test3() {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> list = mapper.getUser2(1l, null, null);
            for (User user : list) {
                System.out.println(user);
            }
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
    public void test4() {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> list = mapper.getUser2(null, "西安", null);
            for (User user : list) {
                System.out.println(user);
            }
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
    public void test5() {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> list = mapper.getUser2(null, null, "张");
            for (User user : list) {
                System.out.println(user);
            }
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
    public void test6() {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> list = mapper.getUser2(null, null, null);
            for (User user : list) {
                System.out.println(user);
            }
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
    public void test7() {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> list = mapper.getUser3(1l, null, null);
            for (User user : list) {
                System.out.println(user);
            }
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
    public void test8() {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> list = mapper.getUser4();
            for (User user : list) {
                System.out.println(user);
            }
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
    public void test9() {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            mapper.update("Trump", 1l, "123456");
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
    public void test10() {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<String> cities = new ArrayList<String>();
            cities.add("西安");
            cities.add("渭南");
            List<User> list = mapper.getUserInCities(cities);
            for (User user : list) {
                System.out.println(user);
            }
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
    public void test11() {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> list = mapper.getUserByName("赵");
            for (User user : list) {
                System.out.println(user);
            }
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
}

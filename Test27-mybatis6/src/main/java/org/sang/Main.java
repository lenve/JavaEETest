package org.sang;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.sang.bean.Person;
import org.sang.bean.User;
import org.sang.db.DBUtils;
import org.sang.db.UserMapper;

import java.util.ArrayList;
import java.util.Date;
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
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> list = userMapper.getUser();
            for (User user : list) {
                System.out.println(user);
            }
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

    @Test
    public void test2() {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = new User();
            user.setPassword("222222");
            user.setUsername("李四");
            Date regTime = new Date();
            user.setRegTime(regTime);
            userMapper.insertUser(user);
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

    @Test
    public void test3() {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = new User();
            user.setPassword("111111");
            user.setUsername("张三");
            Date regTime = new Date();
            System.out.println("regTime:" + regTime.getTime());
            user.setRegTime(regTime);
            userMapper.insertUser2(user);
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

    @Test
    public void test4() {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = new User();
            user.setPassword("111111");
            user.setUsername("张三");
            Date regTime = new Date();
            System.out.println("regTime:" + regTime.getTime());
            user.setRegTime(regTime);
            userMapper.insertUser3(user);
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

    @Test
    public void test5() {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = new User();
            user.setPassword("111111");
            user.setUsername("张三");
            Date regTime = new Date();
            System.out.println("regTime:" + regTime.getTime());
            user.setRegTime(regTime);
            userMapper.insertUser4(user);
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

    @Test
    public void test6() {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            Person p = new Person();
            List<String> list = new ArrayList<String>();
            list.add("足球");
            list.add("排球");
            list.add("音乐");
            list.add("读书");
            p.setInterest(list);
            userMapper.insertPerson(p);
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
    @Test
    public void test7() {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<Person> people = userMapper.getPerson();
            for (Person person : people) {
                System.out.println(person);
            }
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

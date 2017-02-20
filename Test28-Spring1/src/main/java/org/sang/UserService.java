package org.sang;

/**
 * Created by sang on 17-2-20.
 */
public class UserService {
    private UserDao userDao;

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getData() {
        userDao.getData();
    }
}

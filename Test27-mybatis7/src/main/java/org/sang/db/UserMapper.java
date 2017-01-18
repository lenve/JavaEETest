package org.sang.db;

import org.sang.bean.User;

import java.util.List;
import java.util.Map;

/**
 * Created by sang on 17-1-13.
 */
public interface UserMapper {
    public User getUser(Long id);
    public List<User> getUser2();
    public List<User> getUser3();
    public List<User> getUser4();
    public List<User> getUser5();
    public List<Map<String,Object>> getUser6();
}

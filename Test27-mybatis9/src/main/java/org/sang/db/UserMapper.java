package org.sang.db;

import org.apache.ibatis.annotations.Param;
import org.sang.bean.User;

import java.util.List;

/**
 * Created by sang on 17-1-13.
 */
public interface UserMapper {
    public List<User> getUser(@Param("address") String address);

    public List<User> getUser2(@Param("id") Long id, @Param("address") String address, @Param("username") String username);

    public List<User> getUser3(@Param("id") Long id, @Param("address") String address, @Param("username") String username);

    public List<User> getUser4();

    public void update(@Param("username") String username, @Param("id") Long id, @Param("password") String password);

    public List<User> getUserInCities(@Param("cities") List<String> cities);

    public List<User> getUserByName(@Param("username") String username);
}

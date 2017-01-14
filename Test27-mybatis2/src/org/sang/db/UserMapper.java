package org.sang.db;

import org.apache.ibatis.annotations.Select;
import org.sang.bean.User;

/**
 * Created by sang on 17-1-13.
 */
public interface UserMapper {
    @Select(value = "select * from user where id=#{id}")
    public User getUser(Long id);
}

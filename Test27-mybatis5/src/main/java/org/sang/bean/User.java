package org.sang.bean;

import org.apache.ibatis.type.Alias;

/**
 * Created by sang on 17-1-13.
 */
@Alias("u")
public class User {
    private Long id;
    private String userName;
    private String password;
    private String address;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_name='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(Long id, String userName, String password, String address) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.address = address;
    }

    public User() {
    }
}


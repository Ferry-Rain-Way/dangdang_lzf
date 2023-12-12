package com.book.lzf.entity;

import java.io.Serializable;
import java.util.StringJoiner;

/**
 * @Auther: 34838
 * @Date: 2023/2/15 18:37
 * @Description:
 */
public class Admin implements Serializable {
    private String id;
    private String username;
    private String password;

    public Admin() {
    }

    public Admin(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Admin.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("username='" + username + "'")
                .add("password='" + password + "'")
                .toString();
    }
}

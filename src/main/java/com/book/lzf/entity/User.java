package com.book.lzf.entity;

import java.io.Serializable;
import java.util.StringJoiner;

/**
 * @Auther: 34838
 * @Date: 2023/2/16 20:52
 * @Description:
 */
public class User implements Serializable {
    private String id;
    private String email;
    private String password;
    private String salt;
    private String nickname;
    private String status;
    private String code;

    public User() {
    }

    public User(String id, String email, String password, String salt, String nickname, String status, String code) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.salt = salt;
        this.nickname = nickname;
        this.status = status;
        this.code = code;
    }

    public User(String email, String password, String salt, String nickname, String status, String code) {
        this.email = email;
        this.password = password;
        this.salt = salt;
        this.nickname = nickname;
        this.status = status;
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getnickname() {
        return nickname;
    }

    public void setnickname(String nickname) {
        this.nickname = nickname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("email='" + email + "'")
                .add("password='" + password + "'")
                .add("salt='" + salt + "'")
                .add("nickname='" + nickname + "'")
                .add("status='" + status + "'")
                .add("code='" + code + "'")
                .toString();
    }
}

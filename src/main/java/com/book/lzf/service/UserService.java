package com.book.lzf.service;

import com.book.lzf.entity.User;

import java.util.List;

/**
 * @Auther: 34838
 * @Date: 2023/2/17 18:17
 * @Description:
 */
public interface UserService {
    List<User> queryAllUser();
    void updateUserStatus(User user);
}

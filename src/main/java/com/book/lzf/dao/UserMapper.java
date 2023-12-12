package com.book.lzf.dao;

import com.book.lzf.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: 34838
 * @Date: 2023/2/17 18:13
 * @Description:
 */
@Repository
public interface UserMapper {
    //查询所有
    List<User> selectAllUser();

    //更新用户状态
    void updateUserStatus(String status,String email);
}

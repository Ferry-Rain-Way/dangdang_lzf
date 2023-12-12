package com.book.lzf.service.impl;

import com.book.lzf.dao.UserMapper;
import com.book.lzf.entity.User;
import com.book.lzf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 34838
 * @Date: 2023/2/17 18:18
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> queryAllUser() {
       return userMapper.selectAllUser();
    }

    @Override
    public void updateUserStatus(User user) {
        String originalState = user.getStatus();
        if ("正常".equals(originalState)){
            userMapper.updateUserStatus("冻结",user.getEmail());
        }else{
            userMapper.updateUserStatus("正常",user.getEmail());
        }
    }

}

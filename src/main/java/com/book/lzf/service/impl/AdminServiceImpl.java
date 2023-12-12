package com.book.lzf.service.impl;

import com.book.lzf.dao.AdminMapper;
import com.book.lzf.entity.Admin;
import com.book.lzf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: 34838
 * @Date: 2023/2/15 18:43
 * @Description:
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;
    @Autowired
    HttpServletRequest request;

    @Override
    public boolean queryAdmin(Admin admin) {
        //查询用户是否存在
        Admin user = adminMapper.selectAdminByAdmin(admin);
        if (user == null) {
            //用户不存在
            request.setAttribute("message","用户名或密码错误");
            return false;
        }

        return true;
    }
}

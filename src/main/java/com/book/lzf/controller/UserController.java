package com.book.lzf.controller;

import com.book.lzf.entity.User;
import com.book.lzf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Auther: 34838
 * @Date: 2023/2/17 18:16
 * @Description:
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    HttpServletRequest request;

    @Autowired
    UserService userService;

    @RequestMapping("selectAllUsers")
    public String selectAllUser(){
        List<User> users = userService.queryAllUser();
        request.setAttribute("list",users);
        return "back/user/show";
    }

    @RequestMapping("updateUserStatus")
    public String updateUserStatus(User user){

        userService.updateUserStatus(user);
        return "redirect:/user/selectAllUsers";
    }
}

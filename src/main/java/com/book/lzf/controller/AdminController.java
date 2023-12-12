package com.book.lzf.controller;

import com.book.lzf.entity.Admin;
import com.book.lzf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Auther: 34838
 * @Date: 2023/2/15 18:43
 * @Description:
 */
@Controller
@RequestMapping("admin")
public class AdminController {
    @Autowired
    HttpSession session;
    @Autowired
    HttpServletRequest request;
    @Autowired
    HttpServletResponse response;
    @Autowired
    AdminService adminService;

    //登录验证
    @RequestMapping("login")
    public String checkLogin(Admin admin, String inputCode){
        System.out.println(admin + "inputCode" + inputCode);
        //比较输入的验证码和生成的验证码是否相同
        String securityCode = (String) session.getAttribute("securityCode");
        if (!inputCode.equalsIgnoreCase(securityCode)){
            request.setAttribute("message","校验码输入错误");
            return "back/login";
        }

        //查询数据库中该用户是否存在
        boolean isExists = adminService.queryAdmin(admin);
        if (!isExists) {
            return "back/login";
        }

        session.setAttribute("loginAdmin",admin);
        return "redirect:/back/main/main.jsp";
    }

    @RequestMapping("exit")
    public String secureExit() throws IOException {
        //清除Session中的用户数据
        session.removeAttribute("loginAdmin");
        //跳转登陆界面
        return "redirect:/back/login.jsp";
    }
}

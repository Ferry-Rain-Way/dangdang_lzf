package com.book.lzf.controller;

import com.book.lzf.util.CreateValidateCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Auther: 34838
 * @Date: 2023/2/14 20:14
 * @Description:
 */

@Controller
@RequestMapping("security")
public class SecurityController {

    @ResponseBody
    @RequestMapping("getSecurity")
    public void getSecurity(HttpSession session, HttpServletResponse response)
            throws IOException {

        CreateValidateCode vCode = new CreateValidateCode(100, 30, 5, 10);
        //获取随机验证码字符串
        String code = vCode.getCode();
        //数据放入Session中,需要时取出使用
        session.setAttribute("securityCode",code);
        System.out.println("\n"+code+"\n");
        vCode.write(response.getOutputStream());
        /**
         *ImageIO.write(BufferedImage buffImg, "png", response.getOutputStream());
         */
    }
}

























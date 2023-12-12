package com.book.lzf.interceptor;

import org.apache.ibatis.plugin.Intercepts;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: 34838
 * @Date: 2023/2/16 18:38
 * @Description:
 */
@Component
public class AdminInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        Object loginAdmin = request.getSession().getAttribute("loginAdmin");
        if (loginAdmin==null){
            request.getSession().setAttribute("message","尚未登录");
            response.sendRedirect(request.getContextPath()+"/back/login.jsp");
            return false;
        }
        return true;
    }
}























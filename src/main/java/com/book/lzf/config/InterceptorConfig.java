package com.book.lzf.config;

import com.book.lzf.interceptor.AdminInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Auther: 34838
 * @Date: 2023/2/16 19:16
 * @Description:
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AdminInterceptor())
                //拦截路径
                .addPathPatterns("/category/**","/user/**")
                //放行路径
                .excludePathPatterns("/admin/login","/security/**");
    }
}

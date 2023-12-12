package com.book.lzf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: 34838
 * @Date: 2023/2/8 19:02
 * @Description:当前项目的启动类
 *
 */
//该注解的作用是标明springboot项目的启动类
@SpringBootApplication
//包扫描 通过代理生成Mapper的实现类
@MapperScan("com.book.lzf.dao")
public class MainApplication {

    public static void main(String[] args) {
        //主函数运行时,启动整个项目
        SpringApplication.run(MainApplication.class,args);
    }
}

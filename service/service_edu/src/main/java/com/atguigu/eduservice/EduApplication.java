package com.atguigu.eduservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Date : 2022/8/23  20:40
 * @Author : yp001 (5976****@qq.com)
 * @Link :
 * @Version : $
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.atguigu"})
public class EduApplication {
    public static void main(String[] args) {
        SpringApplication.run(EduApplication.class, args);
    }
}

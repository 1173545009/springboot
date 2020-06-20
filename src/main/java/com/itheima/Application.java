package com.itheima;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itheima.mapper")
//启动类中使用注解扫描mapper接口所在的包
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

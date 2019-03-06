package com.ljf.springboot.mybaits.demos;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ljf.springboot.mybaits.demos.dao")
public class StartApp {
    public static void main(String args[]){
        SpringApplication.run(StartApp.class, args);
        System.out.println("服务启动成功！！！！！！！");
        //http://localhost:8080/user/add?userName=ljf&pwd=123&tel=18813010337
    }
}

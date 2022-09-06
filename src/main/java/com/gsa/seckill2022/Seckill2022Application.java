package com.gsa.seckill2022;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gsa.seckill2022.pojo")
public class Seckill2022Application {

    public static void main(String[] args) {
        SpringApplication.run(Seckill2022Application.class, args);
    }

}

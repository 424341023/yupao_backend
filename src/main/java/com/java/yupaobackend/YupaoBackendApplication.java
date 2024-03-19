package com.java.yupaobackend;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 */
@SpringBootApplication
@MapperScan("com.java.yupaobackend.mapper")
public class YupaoBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(YupaoBackendApplication.class, args);
    }

}

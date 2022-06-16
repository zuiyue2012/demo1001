package com.example.demo1001;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication()
@MapperScan(value = "com.example.demo1001.mapper")
@EnableOpenApi
@EnableKnife4j
public class Demo1001Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1001Application.class, args);
    }

}

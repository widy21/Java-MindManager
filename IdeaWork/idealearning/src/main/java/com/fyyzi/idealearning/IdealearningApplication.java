package com.fyyzi.idealearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Spring Boot 启动方法
 *
 * @author 息阳
 * 2017/12/26 14:51
 * @version 1.0
 */
@SuppressWarnings("AlibabaClassMustHaveAuthor")
@SpringBootApplication
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
public class IdealearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdealearningApplication.class, args);
    }
}

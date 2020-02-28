package com.example.testa;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class TestaApplication {

    public static void main(String[] args) {
        log.info("------------------项目开始启动------------------");
        SpringApplication.run(TestaApplication.class, args);
        log.info("------------------项目启动成功------------------");
    }

}

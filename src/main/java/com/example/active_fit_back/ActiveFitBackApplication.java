package com.example.active_fit_back;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ActiveFitBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActiveFitBackApplication.class, args);
        log.info("hola mundo");
    }

}

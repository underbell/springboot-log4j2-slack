package com.github.underbell.slack;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.Level;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringbootLog4j2SlackApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootLog4j2SlackApplication.class, args);
        log.info("{} test", Level.INFO);
        log.warn("{} test", Level.WARN);
        log.error("{} test", Level.ERROR);
    }

}

package com.monster.blackholerunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BlackholeRunnerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlackholeRunnerApplication.class, args);
    }

}

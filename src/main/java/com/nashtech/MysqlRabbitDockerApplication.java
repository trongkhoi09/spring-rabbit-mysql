package com.nashtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.nashtech.repository")
public class MysqlRabbitDockerApplication {


    public static void main(String[] args) {
        SpringApplication.run(MysqlRabbitDockerApplication.class, args);
    }

}

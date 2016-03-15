package com.afm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by rchen on 3/12/16.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@EnableJpaRepositories(basePackages = {"com.afm.repositories"})
@EntityScan(basePackages = "com.afm.entities")
public class SaveOrder {

    public static void main(String[] args) {
        SpringApplication.run(SaveOrder.class, args);
    }

}

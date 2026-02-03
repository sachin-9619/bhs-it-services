package com.bhs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(
    scanBasePackages = {"com.bhs", "com.company"} 
)
@EnableJpaRepositories(basePackages = {"com.company.repository"})
@EntityScan(basePackages = {"com.company.model"})
public class BhsItServicesApplication {
    public static void main(String[] args) {
        SpringApplication.run(BhsItServicesApplication.class, args);
    }
}

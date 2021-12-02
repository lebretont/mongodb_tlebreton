package com.example.mongodb_tlebreton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MongodbTlebretonApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongodbTlebretonApplication.class, args);
    }

}

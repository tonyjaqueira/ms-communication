package com.br.ms.communication.buyfeedback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableRedisRepositories //habilitando a conexão com o REDIS
public class ApplicationBuyFeedback {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ApplicationBuyFeedback.class, args);
    }

}

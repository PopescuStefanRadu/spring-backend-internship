package com.example.app3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

//    @Bean
//    @Primary
//    public UserRepository userRepositoryCassandra() {
//        return new CassandraUserRepository();
//        // DAO - data access object
//        // abstractizare asupra accesului catre DB
//        // pot sa schimb oricand implementarea specifica a DB
//
//
//        // Dependency injection
//        // nu am dat new CassandraUserRepository() sau new JdbcUserRepository() peste tot si sa il schimb peste tot
//        // injectat dependenta + abstractizat contractul ( folosit interfata nu direct XRepository)
//    }
}

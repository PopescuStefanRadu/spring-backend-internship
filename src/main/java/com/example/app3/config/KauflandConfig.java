package com.example.app3.config;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
@RequiredArgsConstructor
public class KauflandConfig {
    private final KauflandApiProperties kauflandApiProperties;


    @PostConstruct
    public void init() {
        System.out.println(kauflandApiProperties);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bye bye kaufland!");
    }
}

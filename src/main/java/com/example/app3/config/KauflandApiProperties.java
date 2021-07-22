package com.example.app3.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties("kaufland.api")
public class KauflandApiProperties {
    private String baseApiUrl;
    private Boolean canBuyProducts;
    private Boolean canMakeDeliveries;
}

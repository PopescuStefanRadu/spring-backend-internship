package com.example.app3.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Optional;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarModel {
    private Long id;
    private String name;
    private String color;
}

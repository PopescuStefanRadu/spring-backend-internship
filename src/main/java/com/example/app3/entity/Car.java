package com.example.app3.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    @Id
    private Long id;
    private String name;
    private String color;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rental_user")
    private User tenant;
}

package com.example.app3.model;

import javax.persistence.Entity;
import javax.persistence.Id;

public class CarModel {
    private Long id;
    private String name;
    private String color;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }
}

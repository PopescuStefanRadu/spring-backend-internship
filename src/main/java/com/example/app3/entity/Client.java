package com.example.app3.entity;

/*
70 entitati  --- 70 tabele
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

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
}

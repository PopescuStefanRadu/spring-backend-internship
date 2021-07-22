package com.example.app3.repository;

import com.example.app3.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findByNameOrderById(String name);  //select * from client where name='gigi' order by id;
    //cuvinte rezervate +  proprietati de pe entiattea de care se ocupa acest repo  Client:  id, name

    Client findByName(String name);

    //queryuri deosebite

}

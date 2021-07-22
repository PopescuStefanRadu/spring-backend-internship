package com.example.app3.repository;

import com.example.app3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByAge(Integer age);  //select * from user where age = ...
    List<User> findByStatus(String status);
    List<User> findByAgeAndStatus(Integer age, String status);  // select * from user where age=... and status=...
    List<User> findByAgeOrStatus(Integer age, String status);  // select * from user where age=... or status=...
    List<User> findByAgeGreaterThan(Integer limit); //select * from user where age > ...
    List<User> findByAgeGreaterThanOrderByNameDesc(Integer limit); //select * from user where age > ... order by name;
    List<User> findByOrderByIdDesc(); //select * from user order by id desc;
    List<User> findTop10ByOrderByAgeDesc(); //select * from user order by age desc;

    void deleteByAge(String age); //delete * from user where age=...
    int countByStatus(String status); //select count(*) from user where status= 'incomplete'


    /*
        @NativeQuery, named query,  join-uri  (Client -> Car -> Color),  @Transcational -> exceptii
     */

}

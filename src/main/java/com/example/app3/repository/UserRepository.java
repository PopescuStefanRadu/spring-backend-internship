package com.example.app3.repository;

import com.example.app3.entity.User;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Primary
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByAge(Integer age);  //select * from user where age = ...
    List<User> findByStatus(String status);
    List<User> findByAgeAndStatus(Integer age, String status);  // select * from user where age=... and status=...
    List<User> findByAgeOrStatus(Integer age, String status);  // select * from user where age=... or status=...
    List<User> findByAgeGreaterThan(Integer limit); //select * from user where age > ...
    List<User> findByAgeGreaterThanOrderByNameDesc(Integer limit); //select * from user where age > ... order by name;
    List<User> findByOrderByIdDesc(); //select * from user order by id desc;
    List<User> findTop10ByOrderByAgeDesc(); //select * from user order by age desc;


    @Query(value = "SELECT MD5(concat(id,'-', name, '-', age)) FROM my_user", nativeQuery = true)
    List<String> getAllUserHashes();

    void deleteByAge(String age); //delete * from user where age=...
    int countByStatus(String status); //select count(*) from user where status= 'incomplete'

    Optional<User> findById(Long id);


    /*
        @NativeQuery, named query,  join-uri  (Client -> Car -> Color),




        @Transcational -> exceptii

        Flyway
        Lombok
        Scopes
        method injection
        Lifecycle Callbacks - @PostConstruct, @PreDestroy
        @Configuration, @Bean - props on @Bean
        Scoped Beans as Dependencies - e.g. injecting request scoped into singleton
        Inject Lists, Sets, Maps<String, ?>, Optional
        @Primary, @Qualifier
        @Value
        @Component: @Service, @Repository, @Controller, etc.
        AutoConfigurations



        Rest: @ModelAttribute, @RequestBody, @ExceptionHandler
        1.3.3 - HandlerMethods


        TODO NamedQuery =? creeaza PreparedStmt?
     */

}

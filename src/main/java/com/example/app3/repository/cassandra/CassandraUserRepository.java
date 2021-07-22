package com.example.app3.repository.cassandra;

import com.example.app3.entity.User;
import com.example.app3.repository.UserRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
//@Primary
public class CassandraUserRepository implements UserRepository {

    @Override
    public Optional<User> findByAge(Integer age) {
        return Optional.empty();
    }

    @Override
    public List<User> findByStatus(String status) {
        return null;
    }

    @Override
    public List<User> findByAgeAndStatus(Integer age, String status) {
        return null;
    }

    @Override
    public List<User> findByAgeOrStatus(Integer age, String status) {
        return null;
    }

    @Override
    public List<User> findByAgeGreaterThan(Integer limit) {
        return null;
    }

    @Override
    public List<User> findByAgeGreaterThanOrderByNameDesc(Integer limit) {
        return null;
    }

    @Override
    public List<User> findByOrderByIdDesc() {
        return null;
    }

    @Override
    public List<User> findTop10ByOrderByAgeDesc() {
        return null;
    }

    @Override
    public List<String> getAllUserHashes() {
        return List.of("hi", "mom");
    }

    @Override
    public void deleteByAge(String age) {

    }

    @Override
    public int countByStatus(String status) {
        return 0;
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public List<User> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<User> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(User entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends User> entities) {

    }

    @Override
    public <S extends User> List<S> saveAll(Iterable<S> entities) {
        return null;
    }


    @Override
    public void flush() {

    }

    @Override
    public <S extends User> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends User> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<User> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public User getOne(Long aLong) {
        return null;
    }

    @Override
    public User getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends User> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends User> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends User> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends User> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends User> S save(S entity) {
        return null;
    }

    @Override
    public void deleteAll() {

    }
}

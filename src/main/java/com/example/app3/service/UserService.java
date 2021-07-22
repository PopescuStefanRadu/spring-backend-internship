package com.example.app3.service;

import com.example.app3.config.KauflandApiProperties;
import com.example.app3.entity.User;
import com.example.app3.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final RestTemplate restTemplate;
    @Value("${kaufland.api.base.url}")
    private final String kauflandApiBaseUrl;
    private final KauflandApiProperties kauflandApiProperties;

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseGet(User::new);
    }

    public User getUsersByAge(Integer age) {
        return userRepository.findByAge(age).orElseGet(User::new);
    }

    public List<User> getUsersByStatus(final String status) {
        return userRepository.findByStatus(status);
    }

    public List<User> getTop10UsersByAge() {
//        return userRepository.findTop10ByOrderByAgeDesc();
        return userRepository.findAll()
                .stream()
                .sorted(Comparator.comparing(User::getAge))
                .limit(10)
                .collect(Collectors.toList());
    }


    // form -> submit -> UserModel -> UserMapper.modelToEntity -> User -> save

    public void saveUser() {
        User user = new User();
        user.setId(11L + new Random().nextInt());
        user.setName("Aslan");
        user.setAge(24);
        user.setStatus("active");

        userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void deleteAllUsers() {
        userRepository.deleteAll();
    }

    public List<String> getUserHashes() {
        return userRepository.getAllUserHashes();
    }

    public void getUserHashesFromExternalApp() {
        String result = restTemplate.getForObject(kauflandApiBaseUrl + "/user/userHashes", String.class); // * 1000
        System.out.println(result);
    }
}

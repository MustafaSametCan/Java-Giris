package com.springboot.api;

import com.springboot.entity.User;
import com.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/user")

public class UserApi {
    @Autowired
    private static UserRepository userRepository;

    @PostConstruct
    public void init() {
        User user = new User();
        user.setName("Samet");
        user.setSurname("Can");
        userRepository.save(user);

    }

    @PostMapping
    public ResponseEntity<User> add(User user) {
        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> listAll() {
        return ResponseEntity.ok(userRepository.findAll());
    }
}

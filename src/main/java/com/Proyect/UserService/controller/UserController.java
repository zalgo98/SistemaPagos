package com.Proyect.UserService.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Proyect.UserService.model.User;
import com.Proyect.UserService.repository.UserRepository;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor

public class UserController {

    private final UserRepository userRepository;

    @GetMapping
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}

package io.github.nebubit.guru.controllers.api;

import java.net.URI;
import java.util.List;

import org.springframework.ui.Model;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import io.github.nebubit.guru.services.JokeService;
import io.github.nebubit.guru.models.User;
import io.github.nebubit.guru.repositories.UserRepository;
import io.github.nebubit.guru.exceptions.UserNotFoundException;

@RestController
@RequestMapping("user")
public class UserController {
    private final UserRepository userRepository;

    @Autowired
    UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getAllUsers () {
        return userRepository.findAll();
    }

    @GetMapping("/{userId}")
    public User getUser (@PathVariable Long userId) {
        return userRepository
               .findById(userId)
               // https://bugs.openjdk.java.net/browse/JDK-8054569, 
               // <UserNotFoundException>orElseThrow
               .<UserNotFoundException>orElseThrow(() -> new UserNotFoundException(userId));
    }
}
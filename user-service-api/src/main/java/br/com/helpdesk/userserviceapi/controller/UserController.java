package br.com.helpdesk.userserviceapi.controller;

import br.com.helpdesk.userserviceapi.entity.User;
import br.com.helpdesk.userserviceapi.repository.UserRepository;
import lombok.AllArgsConstructor;
import models.enums.ProfileEnum;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/users")
public class UserController {

    private final UserRepository userRepository;


    @PostMapping
    public ResponseEntity<User> createUser(){
        User user = new User(null, "Lucas Santos", "lucas@mail.com", "123456", Set.of(ProfileEnum.ROLE_ADMIN));
        user = userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);

    }
}

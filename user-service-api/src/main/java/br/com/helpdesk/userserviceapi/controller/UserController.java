package br.com.helpdesk.userserviceapi.controller;


import models.responses.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/users")
public interface UserController {
    @GetMapping(value = "/{id}")
    ResponseEntity<UserResponse> findUserById(@PathVariable final String id);
}

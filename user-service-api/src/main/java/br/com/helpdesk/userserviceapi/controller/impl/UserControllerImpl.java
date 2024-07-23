package br.com.helpdesk.userserviceapi.controller.impl;

import br.com.helpdesk.userserviceapi.controller.UserController;
import br.com.helpdesk.userserviceapi.entity.User;

import br.com.helpdesk.userserviceapi.service.impl.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserControllerImpl implements UserController {


    private final UserServiceImpl userService;

    @Override
    public ResponseEntity<User> findUserById(String id) {
        User user = userService.findById(id);
        return ResponseEntity.ok(user);
    }
}

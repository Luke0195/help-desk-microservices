package br.com.helpdesk.userserviceapi.service.impl;

import br.com.helpdesk.userserviceapi.entity.User;
import br.com.helpdesk.userserviceapi.repository.UserRepository;
import br.com.helpdesk.userserviceapi.service.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public User findById(String id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User id not found!"));
    }

}
package br.com.helpdesk.userserviceapi.service.impl;

import br.com.helpdesk.userserviceapi.entity.User;
import br.com.helpdesk.userserviceapi.mapper.UserMapper;
import br.com.helpdesk.userserviceapi.repository.UserRepository;
import br.com.helpdesk.userserviceapi.service.UserService;

import lombok.RequiredArgsConstructor;
import models.responses.UserResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    @Transactional(readOnly = true)
    public UserResponse findById(String id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User id not found!"));
        return userMapper.parseEntityToUserMapper(user);
    }

}
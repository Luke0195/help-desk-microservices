package br.com.helpdesk.userserviceapi.service;


import br.com.helpdesk.userserviceapi.entity.User;
import models.responses.UserResponse;

public interface UserService {

    UserResponse findById(String id);

}

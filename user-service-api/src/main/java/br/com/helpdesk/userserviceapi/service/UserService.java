package br.com.helpdesk.userserviceapi.service;


import br.com.helpdesk.userserviceapi.entity.User;

public interface UserService {

    User findById(String id);

}

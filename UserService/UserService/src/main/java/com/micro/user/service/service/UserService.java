package com.micro.user.service.service;

import com.micro.user.service.entity.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    //user operation

    //create
    User save(User user);

    //get all user
    List<User> findAll();

    //get single user of given userId
    User findById(UUID userId);
}

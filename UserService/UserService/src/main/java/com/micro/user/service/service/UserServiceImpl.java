package com.micro.user.service.service;

import com.micro.user.service.entity.User;
import com.micro.user.service.exception.ResourseNotFoundException;
import com.micro.user.service.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;

@Service

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo  userRepo;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public User save(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public User findById(UUID userId) {
        return userRepo.findById(userId).orElseThrow(() -> new ResourseNotFoundException("User with given id not found on server !! : " + userId));
    }
}

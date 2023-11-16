package com.salesass.closer.services;

import java.time.LocalDateTime;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesass.closer.dto.UserRequest;
import com.salesass.closer.entity.User;
import com.salesass.closer.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User createUser(UserRequest userRequest) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        User user = User.build((long) 0, userRequest.getFirst_name(), userRequest.getSecond_name(),
                userRequest.getLast_name(), userRequest.getSecond_last_name(), userRequest.getEmail(),
                userRequest.getPassword(), currentDateTime, currentDateTime);
        return repository.save(user);
    }

    public List<User> getUsers() {
        return repository.findAll();
    }
}

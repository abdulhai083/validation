package com.exceptionhandling.validation.service;

import com.exceptionhandling.validation.dto.UserRequest;
import com.exceptionhandling.validation.entities.User;
import com.exceptionhandling.validation.exception.UserNotFoundException;
import com.exceptionhandling.validation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(UserRequest userRequest){
        User user = User.builder().userId(0).email(userRequest.getEmail())
                .name(userRequest.getName()).gender(userRequest.getGender())
                .mobile(userRequest.getMobile()).build();
        return userRepository.save(user);
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public User getSingleUser(int id){
         return userRepository.findById(id).orElseThrow(()->new UserNotFoundException("user not found with this user id"));
    }
}

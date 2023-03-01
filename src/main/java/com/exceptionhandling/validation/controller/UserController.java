package com.exceptionhandling.validation.controller;

import com.exceptionhandling.validation.dto.UserRequest;
import com.exceptionhandling.validation.entities.User;
import com.exceptionhandling.validation.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequest userRequest){
        User user = userService.saveUser(userRequest);
        return ResponseEntity.ok(user);
    }

    @GetMapping()
    public ResponseEntity<List<User>> getAllUser(){
        return ResponseEntity.ok(userService.getAllUser());
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable(name = "userId") int id){
        return ResponseEntity.ok(userService.getSingleUser(id));
    }
}

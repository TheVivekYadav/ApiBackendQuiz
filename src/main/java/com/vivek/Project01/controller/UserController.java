package com.vivek.Project01.controller;

import com.vivek.Project01.model.Users;
import com.vivek.Project01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public Users register(@RequestBody Users user){
        return service.register(user);
    }

}

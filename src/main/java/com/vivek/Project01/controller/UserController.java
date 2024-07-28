package com.vivek.Project01.controller;

import com.vivek.Project01.model.RegisterUser;
import com.vivek.Project01.service.RegisterUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class UserController {

    @Autowired
    private RegisterUserService service;

    @GetMapping
    public List<RegisterUser> getAllStudent(){
        return service.getAllStudent();
    }

    @PostMapping
    public RegisterUser saveStudent(@RequestBody RegisterUser user){
        return service.saveStudent(user);
    }

    @DeleteMapping("/{rollNo}")
    public void deleteStudent(@PathVariable int rollNo){
        service.deleteStudent(rollNo);
    }

}

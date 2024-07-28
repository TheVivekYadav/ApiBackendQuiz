package com.vivek.Project01.service;

import com.vivek.Project01.model.RegisterUser;
import com.vivek.Project01.repo.RegisterUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterUserService {

    @Autowired
    private RegisterUserRepository repository;

    public List<RegisterUser> getAllStudent(){
        return repository.findAll();
    }

    public RegisterUser saveStudent(RegisterUser student){
        return repository.save(student);
    }

    public void deleteStudent(int rollNo){
        repository.deleteById(rollNo);
    }
}

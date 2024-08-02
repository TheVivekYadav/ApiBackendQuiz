package com.vivek.Project01.service;

import com.vivek.Project01.model.RegisterUser;
import com.vivek.Project01.model.Users;
import com.vivek.Project01.repo.RegisterUserRepository;
import com.vivek.Project01.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public Users register(Users user){
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }

}

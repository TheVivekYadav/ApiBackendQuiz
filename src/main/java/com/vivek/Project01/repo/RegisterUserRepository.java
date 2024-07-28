package com.vivek.Project01.repo;

import com.vivek.Project01.model.RegisterUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterUserRepository extends JpaRepository<RegisterUser, Integer> {
}

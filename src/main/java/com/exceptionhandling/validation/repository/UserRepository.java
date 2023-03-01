package com.exceptionhandling.validation.repository;

import com.exceptionhandling.validation.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}

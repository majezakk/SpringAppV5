package com.example.SpringAppV5.repository;

import com.example.SpringAppV5.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
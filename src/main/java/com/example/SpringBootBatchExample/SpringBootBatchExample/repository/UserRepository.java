package com.example.SpringBootBatchExample.SpringBootBatchExample.repository;


import com.example.SpringBootBatchExample.SpringBootBatchExample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}

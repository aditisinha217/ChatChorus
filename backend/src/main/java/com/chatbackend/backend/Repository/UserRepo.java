package com.chatbackend.backend.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chatbackend.backend.Entity.Users;

@Repository
public interface UserRepo extends CrudRepository<Users, Integer>{
    Users save(Users user);
    Users findUsersByUserId(String userId);
}

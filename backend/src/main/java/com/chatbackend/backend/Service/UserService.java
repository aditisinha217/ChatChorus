package com.chatbackend.backend.Service;


import com.chatbackend.backend.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chatbackend.backend.Entity.Users;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    
    public Users submitMetaDataOfUser(Users user){
        return userRepo.save(user);
    }

    public Users displayMetaDataUsers(String userId){
        return userRepo.findUsersByUserId(userId);
    }
}

package com.chatbackend.backend.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chatbackend.backend.Entity.Users;
import com.chatbackend.backend.Service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("")
    public Users submitUsersDetails(@RequestBody Users users){
        return userService.submitMetaDataOfUser(users);
    }

    @GetMapping("/{userId}")
    private Users getUsersDetails(@PathVariable("userId") String userId){
        return userService.displayMetaDataUsers(userId);
    }
}

package com.chatbackend.backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chatbackend.backend.Entity.Status;
import com.chatbackend.backend.Service.StatusService;
import com.chatbackend.backend.Service.UserService;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/status")
public class StatusController {
    @Autowired
    StatusService statusService;

    
    @PostMapping("")
    public Status submitStatus(@RequestBody Status status) {
        return statusService.submitDataIntoDB(status);
    }

    @GetMapping("")
    public ArrayList<Status> getAllStatus(Status status){
        return statusService.retrieveStatus();
    }
    
}

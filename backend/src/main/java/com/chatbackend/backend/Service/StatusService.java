package com.chatbackend.backend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.chatbackend.backend.Entity.Status;
import com.chatbackend.backend.Repository.StatusRepo;

@Service
public class StatusService {
    @Autowired
    StatusRepo statusRepo;

    @Autowired
    UserService userService;

    public Status submitDataIntoDB(Status status){
        return statusRepo.save(status);
    }

    public ArrayList<Status> retrieveStatus(){
        ArrayList<Status> statusList=statusRepo.findAll();
        statusList.stream().forEach(i-> {
            i.setUserName(userService.displayMetaDataUsers(i.getUserId()).getUserName());
        });
        return statusList;
    }
}

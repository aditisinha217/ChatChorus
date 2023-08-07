package com.chatbackend.backend.Repository;
import com.chatbackend.backend.Entity.Status;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StatusRepo extends CrudRepository<Status, Integer>{
    Status save(Status status);
    ArrayList<Status> findAll();
}

package com.chatbackend.backend.Entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Status {
    @Id
    @GeneratedValue
    private int id;

    private String statusId;
    private String userId;
    private String userName;
    private Timestamp timestamp;
    private String path;
    
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getStatusId() {
        return statusId;
    }
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public Timestamp getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }
    @Override
    public String toString() {
        return "Status [id=" + id + ", statusId=" + statusId + ", userId=" + userId + ", timestamp=" + timestamp
                + ", path=" + path + "]";
    }
    public Status(int id, String statusId, String userId, Timestamp timestamp, String path) {
        this.id = id;
        this.statusId = statusId;
        this.userId = userId;
        this.timestamp = timestamp;
        this.path = path;
    }
    public Status() {
        
    }
    
    
}

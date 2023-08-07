package com.chatbackend.backend.Entity;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="Users")

public class Users {
    @Id
    @GeneratedValue
    private int id;

    @NonNull
    private String userId;
    private String name;
    private String userName;
    public Users() {

    }
    private String profileImg;
    public Users(int id, String userId, String userName, String profileImg, String name) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.profileImg = profileImg;
        this.name = name;
    }
    public String getProfileImg() {
        return profileImg;
    }
    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Users [id=" + id + ", userId=" + userId + ", userName=" + userName + ", profileImg=" + profileImg
                + ", name=" + name + "]";
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

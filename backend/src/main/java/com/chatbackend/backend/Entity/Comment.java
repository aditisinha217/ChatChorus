package com.chatbackend.backend.Entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "Comment")
public class Comment {
    @Id
    @GeneratedValue
    private int id;

    private String commentId;
    private String postId;
    private String userId;
    private Timestamp timestamp;
    private String comment;
    private String userName;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCommentId() {
        return commentId;
    }
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }
    public String getPostId() {
        return postId;
    }
    public void setPostId(String postId) {
        this.postId = postId;
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
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Comment(int id, String commentId, String postId, String userId, Timestamp timestamp, String comment,
            String userName) {
        this.id = id;
        this.commentId = commentId;
        this.postId = postId;
        this.userId = userId;
        this.timestamp = timestamp;
        this.comment = comment;
        this.userName = userName;
    }
    public Comment() {
    }
    @Override
    public String toString() {
        return "Comment [id=" + id + ", commentId=" + commentId + ", postId=" + postId + ", userId=" + userId
                + ", timestamp=" + timestamp + ", comment=" + comment + ", userName=" + userName + "]";
    }
}

package com.chatbackend.backend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.chatbackend.backend.Repository.CommentRepo;
import com.chatbackend.backend.Entity.Comment;

@Service
public class CommentService {
    @Autowired
    CommentRepo commentRepo;

    @Autowired
    UserService userService;

    public Comment saveComment(Comment comment){
        return commentRepo.save(comment);
    }

    public ArrayList<Comment> getAllCommentByPostId(String postId){
        ArrayList<Comment> commentList=commentRepo.findAllByPostId(postId);
        commentList.forEach(s->
        {
            s.setUserName(userService.displayMetaDataUsers(s.getUserId()).getUserName());
        }
        );
        return commentList;
    }
}

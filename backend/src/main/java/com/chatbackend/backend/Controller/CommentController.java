package com.chatbackend.backend.Controller;

import com.chatbackend.backend.Entity.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.chatbackend.backend.Service.CommentService;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    CommentService commentService;
    
    @PostMapping("")
    public Comment submitComment(@RequestBody Comment comment){
        return commentService.saveComment(comment);
    }

    @GetMapping("/{postId}")
    public ArrayList<Comment> getAllComment(@PathVariable("postId")String postId){
        return commentService.getAllCommentByPostId(postId);
    }
}

package com.chatbackend.backend.Repository;
import org.springframework.stereotype.Repository;
import com.chatbackend.backend.Entity.Comment;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface CommentRepo extends CrudRepository<Comment, Integer>{
    Comment save(Comment comment);
    ArrayList<Comment> findAllByPostId(String postId);
}

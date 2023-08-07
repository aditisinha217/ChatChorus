package com.chatbackend.backend.Repository;

import org.springframework.stereotype.Repository;
import com.chatbackend.backend.Entity.Post;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface PostRepo extends CrudRepository<Post, Integer> {

	Post save(Post post);
	ArrayList<Post> findAll();
	
}

package com.chatbackend.backend.Controller;
import com.chatbackend.backend.Entity.Post;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.chatbackend.backend.Service.PostService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
@RequestMapping("/post")
public class PostController {

	@Autowired
	PostService postService;
	
	@PostMapping("")
	private Post submitUserPost(@RequestBody Post post) {
		return postService.submitPostToDataBase(post);
	}
	
	@GetMapping("")
	private ArrayList<Post> getAllPost(){
		return postService.retrivePostFromDB();
	}
}

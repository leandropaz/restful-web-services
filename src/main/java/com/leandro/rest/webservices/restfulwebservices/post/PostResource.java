package com.leandro.rest.webservices.restfulwebservices.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostResource {

	@Autowired
	private PostDaoService service;

	@GetMapping("/users/{user_id}/posts")
	public List<String> retrieveAllUserPosts(@PathVariable int user_id) {
		// TODO throw exception if posts not found
		return service.findAllUserPosts(user_id);
	}

	@GetMapping("/users/{user_id}/posts/{post_id}")
	public Post retrivePostDetails(@PathVariable int user_id, @PathVariable int post_id) {
		Post post = service.findOnePostFromUser(user_id, post_id);
		// TODO throw exception if post not found

		return post;
	}

}

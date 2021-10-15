package com.leandro.rest.webservices.restfulwebservices.post;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PostDaoService {
	private static List<Post> posts = new ArrayList<>();
	private static int postsCount = 3;

	static {
		posts.add(new Post(1, 1, "Post One", "First post of user 1"));
		posts.add(new Post(1, 2, "Post One", "First post of user 2"));
		posts.add(new Post(2, 2, "Post Two", "Second post of user 2"));
	}

	public List<String> findAllUserPosts(int user_id) {
		List<String> userPosts = new ArrayList<>();

		for (Post post : posts) {
			if (post.getUser_id() == user_id) {
				userPosts.add(post.getTitle());
			}
		}
		return userPosts;
	}

	public Post findOnePostFromUser(int user_id, int post_id) {
		for (Post post : posts) {
			if (post.getUser_id() == user_id && post.getPost_id() == post_id) {
				return post;
			}
		}
		return null;
	}

	public Post save(Post post) {
		if (post.getPost_id() == null) {
			post.setPost_id(++postsCount);
		}
		posts.add(post);
		return post;
	}
}

package com.leandro.rest.webservices.restfulwebservices.post;

public class Post {
	private Integer post_id, user_id;
	private String title;
	private String description;

	public Post(Integer post_id, Integer user_id, String title, String description) {
		super();
		this.post_id = post_id;
		this.user_id = user_id;
		this.title = title;
		this.description = description;
	}

	public Integer getPost_id() {
		return post_id;
	}

	public void setPost_id(Integer post_id) {
		this.post_id = post_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Post [post_id=" + post_id + ", user_id=" + user_id + ", title=" + title + ", description=" + description
				+ "]";
	}

}

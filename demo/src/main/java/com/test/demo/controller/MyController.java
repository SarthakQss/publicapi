package com.test.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.service.ServiceClass;

@RestController
@RequestMapping("/")
public class MyController {

	@Autowired
	private ServiceClass service;

	@GetMapping("users")
	public void getUser() {
		service.getUsers();
	}

	@GetMapping("posts")
	public void getPost() {
		service.getPosts();
	}

	@GetMapping("comments")
	public void getComment() {
		service.getComments();
	}

//	@GetMapping("users/{id}")
//	@ResponseBody
//	private void getPostByFilter(@PathVariable int id) {
//		service.getUserByFilters(id);
//	}

//	@GetMapping("post/{userId}")
//	@ResponseBody
//	private void getPostByFilter(@PathVariable String userId) {
//		service.getPostByFilters();
//	}

}

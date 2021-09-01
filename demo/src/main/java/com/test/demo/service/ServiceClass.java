/**
 * 
 */
package com.test.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.demo.model.Comments;
import com.test.demo.model.Post;
import com.test.demo.model.User;

import jdk.internal.net.http.common.Utils;

/**
 * @author Sarthak Pruthi
 *
 */

@Service
public class ServiceClass {

	@Autowired
	@Lazy
	private RestTemplate restTemplate;

	public List<User> getUsers() {
		Object object = restTemplate.getForObject("https://gorest.co.in/public/v1/users", Object.class);

		return new ArrayList<User>();

	}

	public ArrayList<Post> getPosts() {
		// rest template code
		System.out
				.println("DATA :: " + restTemplate.getForObject("https://gorest.co.in/public/v1/posts", String.class));
		;
		return new ArrayList<Post>();
	}

	public ArrayList<Comments> getComments() {
		// rest template code
		System.out.println(
				"DATA :: " + restTemplate.getForObject("https://gorest.co.in/public/v1/comments", String.class));
		;
		return new ArrayList<Comments>();
	}

//	public List<User> getUserByFilters(int id) {
//		Object object = (JSONObject) restTemplate.getForObject("https://gorest.co.in/public/v1/users", Object.class);
//
//		return new ArrayList<User>();
//
//	}
}
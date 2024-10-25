package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")

public class UserController {
	
	private UserService UserService;
	
	
	@PutMapping("/put/{id}")
	public User updateUser(@PathVariable int id, @RequestBody User user) {
		return UserService.updateUser(user, id);
	}
	
	@DeleteMapping("/delete/{id}")
	public User deleteUser(@PathVariable int id) {
		return UserService.deleteUser(id);
	}
	
	@PostMapping("/post")
	public User createUser(@RequestBody User user) {
		return UserService.createUser(user);
	}
	
	@GetMapping("/get")
	public User getUser(@PathVariable int id) {
		return UserService.getUseById(id);
		
	}
}

package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
	private List <User> users = new ArrayList<>();
	public User saveUser(User user) {
		
		for(int i =0; i <users.size(); i++) {			
			if(users.get(i).getId() == user.getId()) {			
				users.set(i, user);				
				return user;
			}				
		}		
		users.add(user);
		return user;
	}
	
	public User findById(int id) {
		for (User user: users) {
			if(user.getId() == id) {
				return user;
			}		
		}
	return null;	
	}
	
	public User deleteById(int id) {
		for(int i = 0; i<users.size(); i++) {
			if(users.get(i).getId() == id) {
				return users.remove(i);
			}
		}
		return null;
	}
	
	
}
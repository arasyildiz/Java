package com.example.demo;

public class UserService {
	private UserRepository UserRepository;
	public User createUser(User user) {
		return UserRepository.saveUser(user);
	}
	
	public User getUseById(int id) {
		return UserRepository.findById(id);
	}
	
	public User deleteUser(int id) {
		return UserRepository.deleteById(id);		
	}
	
	public User updateUser(User user, int id) {
		User existingUser = UserRepository.findById(id);
		if(existingUser !=null) {
			existingUser.setIsim(user.getIsim());
			existingUser.setEmail(user.getEmail());
			return UserRepository.saveUser(existingUser);
		}
	return null;	
	}
}

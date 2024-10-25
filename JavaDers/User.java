package com.example.demo;

public class User {
	private String isim;
	private int id;
	private String email;
	
	public User() {
		
	}
	
	public User(String isim, int id,String email) {
		super();
		this.isim = isim;
		this.id = id;
		this.email = email;
		
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}


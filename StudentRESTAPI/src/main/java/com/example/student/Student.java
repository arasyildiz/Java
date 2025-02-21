package com.example.student;


public class Student {
	
	
	private int id;
	private String name;
	private String surname;
	private String program;
	
	public Student(int id, String name, String surname, String program) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.program = program;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	
	@Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", surname=" + surname + ", program=" + program + "]";
    }
	
	
	
	

}

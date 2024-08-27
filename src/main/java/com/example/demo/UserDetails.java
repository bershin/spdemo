package com.example.demo;

public class UserDetails {
	String firstName;
	String lastname;
	int age;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public UserDetails(String firstName, String lastname, int age) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "UserDetails [firstName=" + firstName + ", lastname=" + lastname + ", age=" + age + "]";
	}
	

}

package day5Homework1.entities.concretes;

import day5Homework1.entities.abstracts.Entity;

public class User implements Entity{
	private int id;
	private String nationalId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	public User() {
		
	}


	public User(int id, String nationalId, String firstName, String lastName, String email, String password) {
		super();
		this.id = id;
		this.nationalId = nationalId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}


	public int getId() {
		return id;
	}


	public String getNationalId() {
		return nationalId;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getEmail() {
		return email;
	}


	public String getPassword() {
		return password;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	

}

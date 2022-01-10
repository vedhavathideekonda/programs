package springmvc_example_model;

import java.util.Date;

public class Employee {
	 private Integer id;
	 private String username;
	 private String firstname;
	 private String lastname;

	 
	 public Employee() {
	  super();
	 }
	 
	 public Employee(Integer id, String username, String firstname, String lastname) {
	  super();
	  this.id = id;
	  this.username = username;
	  this.firstname = firstname;
	  this.lastname = lastname;
	 }

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	public String getFirstname() {
		// TODO Auto-generated method stub
		return firstname;
	}

	public String getLastname() {
		// TODO Auto-generated method stub
		return lastname;
	}

	
	
	
}


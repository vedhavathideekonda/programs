package formvalidation.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



public class Employee {
	@Size(min=2, max=20, message="Please enter between {min}-{max} characters")
 private String username;
	@Pattern(regexp="_,$,#.,@" , message="must contain special character")
 private String password;
 @NotEmpty
 @NotNull
 private String email;
 @Size(min=10,max=10)
 private String contact;
 @NotNull
 private String city;
 @NotNull 
 @NotEmpty
 private String zipcode;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getZipcode() {
	return zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}
 
}
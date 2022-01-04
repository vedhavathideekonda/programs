package Details;

public class CustomerClass {
private int id;
private String name;
private  int contact;

private AddressClass address;
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
public int getContact() {
	return contact;
}
public void setContact(int contact) {
	this.contact = contact;
}

public AddressClass getAddress() {
	return address;
}
public void setAddress(AddressClass address) {
	this.address = address;
}
public void display() {
	System.out.println(id+" "+name+" "+contact);
	System.out.println(address);
}
}

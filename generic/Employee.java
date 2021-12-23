package generic;

public class Employee {
String name;
int id;
String department;
int salary;
public Employee(String name,int id,String department,int salary)
{
	this.name=name;
	this.id=id;
	this.department=department;
	this.salary=salary;
}
@Override
public int hashCode()
{
	return id;
}
public boolean equals(Object obj) {
	Employee employee =(Employee) obj;
	return(id==employee.id);
}
public String toString()
{
	return id+","+name+","+department+","+salary;
}
}

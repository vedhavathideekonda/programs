package generic;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
	HashSet<Employee>set=new HashSet<Employee>();
   set.add(new Employee("Anvika",101,"HR",20000));
   set.add(new Employee("Sita",102,"IT",40000));
   set.add(new Employee("Anusha",103,"ACCOUNTS",30000));
   set.add(new Employee("harsha",104,"EDD",30000));
   set.add(new Employee("heena",105,"KYC",20000));
   Iterator<Employee> it =set.iterator();
   while(it.hasNext())
   {
	   Employee employee=(Employee)it.next();
	   System.out.println(employee);
      }
	}

}

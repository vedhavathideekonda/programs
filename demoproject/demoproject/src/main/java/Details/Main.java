package Details;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
private static ApplicationContext context;

public static void main(String[] args) {
	context=new ClassPathXmlApplicationContext("customerClass.xml");
	CustomerClass customerClass = (CustomerClass) context.getBean("CustomerClass");
	customerClass.display();
}
}
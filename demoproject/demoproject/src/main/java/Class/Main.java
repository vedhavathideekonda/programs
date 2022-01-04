package Class;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class Main {
private static ApplicationContext context;

public static void main(String[] args) {
	context=new ClassPathXmlApplicationContext("student.xml");
	 Student student  = (Student)context.getBean("Student");
	 student.display();
}

}

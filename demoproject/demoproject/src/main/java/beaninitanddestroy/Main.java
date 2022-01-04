package beaninitanddestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
 private static ApplicationContext context;
	
	public static void main(String[] args) {
		context=new ClassPathXmlApplicationContext("hello.xml");
		((AbstractApplicationContext) context).registerShutdownHook();
		Hello hello = (Hello) context.getBean("Hello");
		hello.sayHello();
	}

}

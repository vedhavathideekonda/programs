package application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class DrawingApp {
	 private static ApplicationContext context;
	public static void main(String[] args) {
		context=new ClassPathXmlApplicationContext("stline.xml");
		Straightline straightline= (Straightline) context.getBean("Straightline");
		straightline.draw();
}
	

	}


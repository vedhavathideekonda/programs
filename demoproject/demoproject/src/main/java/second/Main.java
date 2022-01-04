package second;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
	 private static ApplicationContext context;
		public static void main(String[] args) {
			context=new ClassPathXmlApplicationContext("Question3.xml");
			Question2 question= (Question2) context.getBean("Question2");
			question.display();
	}
}

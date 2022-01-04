package beaninitanddestroy;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class HelloEvent extends ApplicationEvent{

	public HelloEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "helloeventoccured";
		
	}
	
}

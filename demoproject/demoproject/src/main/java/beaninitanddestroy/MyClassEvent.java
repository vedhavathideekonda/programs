package beaninitanddestroy;

import java.util.EventListener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
@Component
public class MyClassEvent implements ApplicationListener{

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
	System.out.println(event.toString());
		
	}
	

}

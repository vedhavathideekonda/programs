package beaninitanddestroy;
//using annotations
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Hello implements ApplicationEventPublisherAware {
	private String message;
	private ApplicationEventPublisher publisher;
	public void getMessage() {
		
		System.out.println("your message"+message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	// This method executes automatically as the bean is instantiated
	@PostConstruct
	public void init() {
		System.out.println("Bean is going through init");
	}
	// This method executes when the spring container is closed
	@PreDestroy
	public void destroy() {
		System.out.println("Bean will destroy now");
	}

	public void sayHello() {
		System.out.println(message);
		HelloEvent helloEvent=new HelloEvent(this);
		publisher.publishEvent(helloEvent);
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
		
	}
	

}





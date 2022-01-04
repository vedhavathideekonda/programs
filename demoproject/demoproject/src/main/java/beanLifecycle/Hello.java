package beanLifecycle;
//by xml
public class Hello {
private  String message;

public void sayHello() {
	System.out.println("your message"+message);
}

public void setMessage(String message) {
	this.message = message;
}
public void init()  {
	System.out.println("Bean is going through init");
}
public void destroy()  {
	System.out.println("Bean will destroy now");
}
}

package application;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Straightline implements ApplicationContextAware, BeanNameAware{

private Point pointA;
private Point pointB;
private ApplicationContext context = null;

public void setA(Point pointA) {
	this.pointA = pointA;
}

public void setB(Point pointB) {
	this.pointB = pointB;
}
public void draw() {
	System.out.println("pointA is("+pointA.getX()+","+pointB.getY()+")");
	System.out.println("pointB is("+pointA.getX()+","+pointB.getY()+")");
}
	

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.setContext(context);
		
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Bean name is"+name);
		
	}

	public ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext context) {
		this.context = context;
	}

}

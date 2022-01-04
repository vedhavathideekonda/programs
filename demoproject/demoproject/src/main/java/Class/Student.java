package Class;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@ComponentScan
public class Student {
private Integer AGE;
private String NAME;
public Integer getAGE() {
	return AGE;
}
@SuppressWarnings("deprecation")
@Required
public void setAGE(Integer AGE) {
	this.AGE = AGE;
}
public String getNAME() {
	return NAME;
}
@SuppressWarnings("deprecation")
@Required
public void setNAME(String NAME) {
	this.NAME = NAME;
}
public void display() {
	System.out.println(AGE+" "+NAME);
}
}

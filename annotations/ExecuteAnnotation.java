package annotations;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(METHOD)
@interface Execute {
int sequence();
}
class myClass{
@Execute(sequence=3)
public void method1() {
	System.out.println("world");
}
@Execute(sequence=1)
public void method2() {
	System.out.println("my");
}
@Execute(sequence=2)
public void method3() {
	System.out.println("hello");
}
}
public class ExecuteAnnotation {
	public static void main(String[] args) {
		myClass c = new myClass();
		c.method2();
		c.method3();
		c.method1();
}
}

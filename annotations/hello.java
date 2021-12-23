package annotations;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(METHOD)
@interface run {

}

class C{
	@run
	 void run() {
			System.out.println("run the test");
}
}
public class hello {
	public static void main(String[] args) {
		C a= new C();
		a.run();
	}
}


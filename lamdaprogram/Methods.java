package lamdaprogram;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Methods {

	public static void main(String[] args) {
	
Supplier<Integer> supplier =()->new Integer((int)(Math.random()*10000));
System.out.println("Supplier API");


Consumer<Integer> consumer=(value)->System.out.println("value");
System.out.println("consumer API");

Predicate predicate = (value) -> value != null;
System.out.println("predicate API");

Function<Long,Long>adder = (value)->value + 3;
Long resultlambda = adder.apply((long)8);
System.out.println("resultlamda function API="+resultlambda);
	}

}

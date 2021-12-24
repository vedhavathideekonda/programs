package lamdaprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.UnaryOperator;

public class Replaceallunary {
	public static void main(String[] args) throws CloneNotSupportedException
	{
		ArrayList<String> words = new ArrayList<>(Arrays.asList("manu","rani","renna","renu","vani"));
		System.out.println(words);
		words.replaceAll(new MyOperator());
		System.out.println(words);
}
}
class MyOperator implements UnaryOperator<String>
{

	@Override
	public String apply(String t) {
		// TODO Auto-generated method stub
		return t.toUpperCase(); 
	}
}
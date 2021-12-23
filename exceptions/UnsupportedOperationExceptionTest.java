package exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UnsupportedOperationExceptionTest {
	 //throws  UnsupportedOperationException
		/*public static void main(String[] args) {
		String str[]= {"dog","cat"};
		List<String> l =Arrays.asList(str);
		System.out.println(l);
		l.add("goat");
		}*/
	
	
		//problem solving by using mutableList modified such as arraylist

	public static void main(String[] args) {
	String str[]= {"dog","cat"};
	List<String> list =Arrays.asList(str);
	List<String>l=new ArrayList<>(list);
	l.add("goat");
	for(String s:l)
		System.out.println(s);
	
	}
	
	}



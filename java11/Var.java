package java11;

public class Var {
/*var is a keyword which detects the datatype automatically of a
	variable based on the surrounding context*/
	
	//var can be used to detect any datatype
	public static void main(String[] args) {
		//int 
		var a =100;
		var b=1.09;//double
	    var c='a';//char
	    var d="vedha";
	    var e=true;//boolean
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	    System.out.println(d);
	    System.out.println(e);
	}

//var can be used to declare local variable
	/*
	 * var x=10;
	 * System.out.println(x);
	 */
}
//var cannot be used in an instance and global variable declaration.
/*// Java program to demonstrate that
// var cannot be used to declare
// instance and global variables

class Var {

	// instance variable
	var x = 50;
	public static void main(String[] args)
	{
		System.out.println(x);
	}
}

*/
//
/* Java program to demonstrate that
 var cannot be used as a Generic type

import java.util.*;
class Var {
	public static void main(String[] args)
	{
		// Generic list using var
		var<var> al = new ArrayList<>();
			
		// add elements
		al.add(10);
		al.add(20);
		al.add(30);
		
		// print the list
		System.out.println(al);
	}
}
/*
 *  Java program to demonstrate that
var cannot be used with Generic type

import java.util.*;
class Var {
	public static void main(String[] args)
	{
		// var used with Generic type
		var<Integer> al = new ArrayList<Integer>();
		
		// add elements
		al.add(10);
		al.add(20);
		al.add(30);
		
		// print the list
		System.out.println(al);
		
		// This is valid since type is decided
		// based on ArrayList<String>
		var list = new ArrayList<String>();
	}
}
*/
/*
 * Java program to demonstrate that var cannot be used with LambdaExpression

import java.util.*;

interface myInt {
	
	int add(int a, int b);
}
class Var {
	public static void main(String[] args)
	{
		
		// var cannot be used since they
		// require explicit target type
		var obj = (a, b) -> (a + b);

		// calling add method
		System.out.println(obj.add(2, 3));
	}
}

 */

package string;

public class stringbuiderdemo {
	

		public static void main(String[] args) {
			StringBuilder builder = new StringBuilder("StringBuilder");
	        builder.append(" is a peer class of string"+"that provides much of"+"functionality of strings.");
	        System.out.println(builder);
	        StringBuilder builder1 = new StringBuilder("It is used to at the specified index position");
	        builder1.insert(14, "insert text ");
	        System.out.println(builder1);
	        StringBuilder builder2 = new StringBuilder("It is used to reverse the string");
	        builder2.reverse();
	        System.out.println(builder2);
	}}



package exceptions;

public class TryCatch {
public static void main(String[]args) {
	int a=5;
	int b=0;
	int result;

		try {
			result=a/b;
System.out.println("after exception");
		} catch (Exception e) {
			System.out.println("division by zero ");
			e.printStackTrace();
		}
		System.out.println("after catch statement");
}
}

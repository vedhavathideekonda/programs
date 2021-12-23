package lamdaprogram;


interface Arithmetic {
int operation(int a,int b);
}

public class Operations {

	public static void main(String[] args) {
		    Arithmetic add=(int a,int b)->(a+b);
			System.out.println("addition = " +add.operation(5,6));
			
			Arithmetic sub=(int a,int b)->(a-b);
			System.out.println("addition = " +sub.operation(10,6));
			
			Arithmetic mul=(int a,int b)->(a*b);
			System.out.println("addition = " +mul.operation(5,6));
			
			Arithmetic div=(int a,int b)->(a/b);
			System.out.println("addition = " +div.operation(6,3));
			
	
		}
	}
	
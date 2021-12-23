package sample;

import java.util.Scanner;

public class Armstrong {
 
	public static void main(String[] args) {
		
		int  Number ,remainder ,result=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=s.nextInt();
	    Number = n;
	    while (Number !=0)
	    {
	    	remainder = Number % 10;
	    	result += Math.pow(remainder,3);
	    	Number /= 10;
	    }
	    if(result == n)
      System.out.println(n+"is an armstrong number");
	    else
	    	System.out.println(n+"is not an armstrong number");
	}

}

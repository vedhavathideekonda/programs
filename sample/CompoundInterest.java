package sample;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the principal:");
		double principal = input.nextDouble();
		
		System.out.print("Enter the rate:");
		double rate = input.nextDouble();
		
		System.out.print("Enter the time:");
		double time = input.nextDouble();
		
		System.out.print("Enter number 0f  times interest is compounded:");
		double number = input.nextDouble();
		
		double interest=principal*(Math.pow((1+rate/100),(time* number))) -principal;
		double amount=interest+principal;
		System.out.println("principal :"+principal);
		System.out.println("rate :"+rate);
		System.out.println("time :"+time);
		System.out.println("compound interest :"+interest);
		System.out.println("number ot time interest compounded:"+amount);
	}
	

	}



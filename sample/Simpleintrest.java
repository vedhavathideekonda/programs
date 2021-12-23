package sample;

import java.util.Scanner;

public class Simpleintrest {
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the principal:");
			double principal = input.nextDouble();
			
			System.out.print("Enter the rate:");
			double rate = input.nextDouble();
			
			System.out.print("Enter the time:");
			double time = input.nextDouble();
			
			double interest=(principal*time*rate)/100;
			double amount = principal+interest;
			
			System.out.println("principal :"+principal);
			System.out.println("rate :"+rate);
			System.out.println("time :"+time);
			System.out.println("interest :"+interest);
			System.out.println("interest+amount total is :"+amount);
		}
		
	}
	}


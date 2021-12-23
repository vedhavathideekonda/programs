package sample;

import java.util.Scanner;

public class Incometax {

	public static void main(String[] args) {
		double t=0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the amount:");
		double i=in.nextDouble();
		t=incometax(i);
		System.out.print("Enter incometax amount:"+t);
	}

	 static double incometax(double i) {
		double tax;
		if(i<=180000)
			tax=0;
		else if(i<=300000)
			tax=0.1*(i-180000);
		else if(i<=500000)
			tax=(0.2*(i-300000));
		else if(i<=1000000)
			tax=(0.3*(i-500000));
		else
			tax=(0.4*(i-1000000));
		return tax;
	}

}

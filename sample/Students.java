package sample;

import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
     int A[]=new int[3];
     int B[]=new int[3];
     int C[]=new int[3];
    double Total[]=new double[4];
    double A1_Total=0,B1_Total=0,C1_Total=0;
    double avg[]=new double[4];
    double A1_avg=0,B1_avg=0,C1_avg=0;
    Scanner in=new Scanner(System.in);
	for (int i=0;i<3;i++) {
	
		System.out.print("student:"+ i+1);
		System.out.print("Enter the A marks:");
		A[i]=in.nextInt();
		System.out.print("Enter the B marks:");
		B[i]=in.nextInt();
		System.out.print("Enter the C marks:");
		C[i]=in.nextInt();

		Total[i] = A[i]+B[i]+C[i];
		avg[i]=A[i]+B[i]+C[i]/3;
		
		A1_Total=A[i]+A1_Total;
		B1_Total=B[i]+B1_Total;
		C1_Total=C[i]+C1_Total;
		
		A1_avg=A1_Total/3;
		B1_avg=B1_Total/3;
		C1_avg=C1_Total/3;
	}
	for(int i=0;i<3;i++)
	{
	System.out.println("total marks of name"+i+" is "+Total[i]);
	System.out.println("avg marks of name "+i+" is "+avg[i]);
	
	}
	System.out.print(" the total A marks:"+A1_Total);
	System.out.print(" the total B marks:"+B1_Total);
	System.out.print(" the total C marks:"+C1_Total);
	
	System.out.print(" the total A avg:"+A1_avg);
	System.out.print(" the total B avg:"+B1_avg);
	System.out.print(" the total C avg:"+C1_avg);
}}

package organization;

import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {


Scanner sc=new Scanner(System.in);
System.out.println("press 1 or 2 for details");
int s=sc.nextInt();


switch(s)
{
case 1:
{
Manager m=new Manager();
m.basic=35000;
m.GrossSalary();
m.NetSalary();
m.TaxPay();
m.TotalPay();
m.display();
break;
}
case 2:
{
Labour l=new Labour();
l.basic=25000;
l.GrossSalary();
l.NetSalary();
l.TaxPay();
l.OvertimePay();
l.TaxPay();
l.display();
break;
}



}



}




}

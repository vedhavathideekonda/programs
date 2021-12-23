package organization;

public class Manager extends Employee
{
public void NetSalary()
{
NetSal=basic+(basic*20/200)+(basic*95/100)+1000;
}
public void GrossSalary()
{
Gross=basic+(basic*95/100)+(basic*25/100);
}
public void TaxPay()
{
TaxVal=(basic*25/100);
}
public void TotalPay() {
total=(Gross+NetSal+TaxVal);
}
public void display()
{
System.out.println("the gross salary of manager:" +Gross);
System.out.println("the net salary of manager:" +NetSal);
System.out.println("the taxpay salary of manager:" +TaxVal);
System.out.println("the total salary of manager:" +total);
}
}

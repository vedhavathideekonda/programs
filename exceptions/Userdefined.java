package exceptions;

import java.util.Scanner;

public class Userdefined {
int id;
double balance;
double withdraw;
public Userdefined(int id,double balance,double withdraw)throws InsufficientBalanceException,IllegalBanktransactionException{
	this.id=id;
	this.balance=balance;
	this.withdraw=withdraw;
	withdrawFunctionality();
}

private void withdrawFunctionality() throws InsufficientBalanceException,IllegalBanktransactionException{
	
	if(balance == 0|| withdraw>balance) {
		throw new InsufficientBalanceException("InsufficientBalance");
}
	else if(withdraw<0)
	{
		throw new IllegalBanktransactionException("amount should not be negative");
	}

}
	public static void main(String[] args) throws InsufficientBalanceException {
		Scanner s =new Scanner(System.in);
		System.out.println("enter id : ");
		int id = s.nextInt();
		System.out.println("enter balance:");
		double balance = s.nextDouble();
		System.out.println("enter withdraw amount:");
		double withdraw = s.nextDouble();
		}
	
}


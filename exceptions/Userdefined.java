package exceptions;

import java.util.Scanner;

public class Userdefined {

    long id ;
    double balance;
    double withdraw;

    public Userdefined (long id, double balance) throws InsufficientBalanceException, IllegalBanktransactionException {
        this.id=id;
        this.balance=balance;

        
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

    public void withdraw(int amt) throws InsufficientFundsException {
        if(amt <= balance) {
            balance -= amt;
        }
        else {
            int newBalance = (int) (amt - balance);
            throw new InsufficientFundsException(newBalance);
        }

    }
    public static void main(String[] args) throws InsufficientBalanceException, IllegalBanktransactionException {
    	
    	Userdefined ac = new Userdefined(1234, 10000);
    	  try {
              ac.withdraw(15000);
              System.out.println("successful transaction");
          }catch(InsufficientFundsException e)
    	  {
        	  System.out.println("InsufficientFundsException ");
    
          }


    }

}

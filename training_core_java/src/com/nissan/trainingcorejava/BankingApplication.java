/**
 * 
 */
package com.nissan.trainingcorejava;

import java.util.Scanner;

/**
 * @author HP
 *
 */

abstract class NewLoan
{
	final double genRate=27;
	final double currRate=20;
	final double fdRate=10;
	abstract double getRateOfInterest(int choice);
}

class Bank extends NewLoan{
	
	User user;
	
	public Bank(User u)
	{
		this.user=u;
	}
	public double getRateOfInterest(int choice){
		
		double rate=-1;
		if(choice==1)
		{
			rate=super.genRate;
		}
		else if(choice==2)
		{
			rate=super.currRate;
		}
		else
		{
			rate=super.fdRate;
		}
		
		return rate;
	}
	
	public void showTransactions(){
		
		System.out.println("Welcome to XYZ Bank, choose a transaction option from below menu");
		System.out.println("1. Deposit");
		System.out.println("2. Loan");
		System.out.print("Enter your option-");
	}
	
	public void initiateDeposit() {
		
		Scanner s= new Scanner(System.in);
		System.out.println();
		System.out.print("Enter amount to deposit-");
		int amount=s.nextInt();
		System.out.println();
		this.user.account.balance+=amount;
		System.out.println("Updated balance is-"+this.user.account.balance);
		System.out.println("Transaction completed.");
	}
	
	public void initiateLoan()
	{
		System.out.println("Select loan option-");
		System.out.println("1. General Loan");
		System.out.println("2. Current Loan");
		System.out.println("3. FD Loan");
		System.out.print("Enter your option-");
		Scanner s=new Scanner(System.in);
		System.out.println();
		int option=s.nextInt();
		System.out.print("Enter amount-");
		double amount=s.nextDouble();
		System.out.println();
		double rate=getRateOfInterest(option);
		if(option==1)
		{
			System.out.println("Loan Amount-"+amount);
			System.out.println("Rate of interest-"+rate);
			System.out.println("Interest Amount-"+amount*(rate/100));
			
		}
		else if(option==2)
		{
			if(this.user.account.balance>=20000)
			{
				System.out.println("Loan Amount-"+amount);
				System.out.println("Rate of interest"+rate);
				System.out.println("Interest amount-"+amount*(rate/100));
			}
			else
			{
				System.out.println("Insufficient funds.");
			}
		}
		else if(option==3)
		{
			if(this.user.account.type=="FD" && this.user.account.balance>2*amount)
			{
				System.out.println("Loan Amount-"+amount);
				System.out.println("Rate of interest-"+rate);
				System.out.println("Interest amount-"+amount*(rate/100));
			}
			else
			{
				System.out.println("No FD with sufficient balance.");
			}
		}
		
	}
	
	
}

class Account{
	
	String type;
	long accountNumber;
	double balance=0;
	
}

class User{
	
	
	Account account;
	String name;
	int pin;
	public User(String name,String type,long acNo,double bal,int p){
		
		this.account= new Account();
		this.name=name;
		System.out.println(type);
		this.account.type=type;
		this.account.accountNumber=acNo;
		this.account.balance=bal;
		this.pin=p;
		System.out.println("User Created---------------------------------------------");
		System.out.println("Account Details-");
		System.out.println("Account Holder Name-"+this.name);
		System.out.println("Account Number-"+this.account.accountNumber);
		System.out.println("Account Type-"+this.account.type);
		System.out.println("Account Balance-"+this.account.balance);
		System.out.println("---------------------------------------------------------");
	}
	
}
public class BankingApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//Create User and account
		User user= new User("Shyam","SA",1000111000,20000,2345);
		System.out.print("Enter PIN-");
		int pin=s.nextInt();
		if(pin==user.pin)
		{
			Bank bank= new Bank(user);
			bank.showTransactions();
			int choice=s.nextInt();
			System.out.println("Your choice is-"+choice);
			if(choice!=1 && choice !=2)
			{
				System.out.println("Invalid option");
			}
			else
			{
				if(choice==1)
				{
					bank.initiateDeposit();
				}
				else
				{
					bank.initiateLoan();
				}
			}

		}
		else
		{
			System.out.println("Incorrect PIN");
		}
		
	}

}

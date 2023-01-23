package exceptionhandling;

import java.util.Scanner;

public class SavingAccount {

	public static void main(String[] args) {
		try {
			Scanner sc  = new Scanner(System.in);
			long id = sc.nextLong();
			double balance  = sc.nextDouble();
			double withdraw =sc.nextDouble() ;
			double deposit = sc.nextDouble();
			
			balance = balance - withdraw;
			balance = balance + deposit;
			
			if(balance < 0.0) {
            	System.out.println("Insufficient Balance Exception Balance can't be negative");
			}
			else if(balance == 0.0) {
            	System.out.println("Insufficient Balance Exception");
			}
			else if(withdraw >= balance) {
            	System.out.println("Illegal Bank Transaction");
            }
            
            System.out.println("Id :"+ id);
			System.out.println("Balance is :" + balance);
			System.out.println("withdraw amount :" + withdraw);
			System.out.println("Deposited amount is :" + deposit);
			sc.close();
            }
		catch(ArithmeticException ex){
			 
			System.out.println();
		}
	}

}

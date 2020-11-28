import java.util.Scanner;

//Santiago Fleiderman
//CSc 2010, Principles of Computer Science
//Spring 2014
//Assignment 5; Programming Objects
// Modifying the Account and TestAccount so that it gives you two instance variables.
//03-4-2014
public class TestAccount {
  public static void main(String[] args) {
	  System.out.println("enter your money,customer name, account number");//Make sure to put enter after each one
	  		
	     Scanner pc = new Scanner( System.in );
		 double money =pc.nextDouble();
		 Scanner sc = new Scanner( System.in );
		 String customer=sc.next();
		 Scanner reader = new Scanner( System.in );
		 String account=reader.next();
                
    Account acct1 = new Account(money,customer,account);
    System.out.println("Balance in account 1: " +
                       acct1.getBalance());
    acct1.deposit(100.00);
    System.out.println("Balance in account 1: " +
                       acct1.getBalance());
    acct1.withdraw(150.00);
    System.out.println("Balance in account 1: " +
                       acct1.getBalance());
acct1.close();
    System.out.println("Balance in account 1: " +
                       acct1.getBalance());
    acct1.getCustomer();
    System.out.println("customer name is " +
            acct1.getCustomer());
    acct1.getaccountnumber();
    System.out.println("the account number is " +
            acct1.getaccountnumber());
    
	
    Account acct2 = new Account();
    System.out.println("Balance in account 2: " +
                       acct2.getBalance());
    acct2.deposit(500.00);
    System.out.println("Balance in account 2: " +
                       acct2.getBalance());
    acct2.withdraw(350.00);
    System.out.println("Balance in account 2: " +
                       acct2.getBalance());
    acct2.close();
    System.out.println("Balance in account 2: " +
                       acct2.getBalance());
  }
  
  
}

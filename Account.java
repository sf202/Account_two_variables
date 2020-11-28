//Santiago Fleiderman
//CSc 2010, Principles of Computer Science
//Spring 2014
//Assignment 5; Programming Objects
// Modifying the Account and TestAccount so that it gives you two instance variables.
//03-4-2014
public class Account {
  // Instance variables
  private double balance;
  String customer;
  String AccountNumber;
  

  // Constructors
  public Account(double initialBalance, String name,String account) {
    balance = initialBalance;
    customer=name;
    AccountNumber=account;
  }

  public Account() {
    balance = 0.0;
  }
// Instance methods
  //setters
  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) {
    balance -= amount;
  }
//getters
  public double getBalance() {
    return balance;
  }

  public void close() {
    balance = 0.0;
  }
  public String getCustomer(){
	  return customer;
  }
  public String getaccountnumber(){
	  return AccountNumber; 
  }
}

//Trayce Martineau
//10-11-18

import java.util.Date;
import java.util.*;

public class Account {

	private int id;
	private	double balance;
	private double annualInterestRate;
	private Date dateCreated;


public Account() {
	id = 0; 
	balance = 100;
	annualInterestRate = 0;
	dateCreated = new Date();
	}	

public Account(int newid, double newBalance) {
	id = newid;
	balance = newBalance;
	dateCreated = new Date();
	}

public void setid(int newid){
	id = newid;
	}

	// Set balance 
public void setBalance(double newBalance) {
		balance = newBalance;
	}

	// Set annualInterestRate
public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}



	//Return id
public int getId() {
		return id;
	}

	// Return balance
public double getBalance() {
		return balance;
	}

	// Return annualInterestRate
public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	// Return dateCreated
public String getDateCreated() {
		return dateCreated.toString();
	}

	// Return monthly interest rate
public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	// Methods
	// Return monthly interest
public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}

	// Decrease balance by amount
public void withdraw(double amount) {
		balance = balance - amount;
	}

	// Increase balance by amount
public void deposit(double amount) {
		balance = balance + amount;
	}
}
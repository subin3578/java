package Test20;

import java.util.Scanner;

public class Account {
	
	String number;
	 String name;
	 int balance;

	 
	public Account(String number, String name, int balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}

		 public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String toString() {
		        return number + "   " + name + "   " + balance + '\n';
		    }

}
		

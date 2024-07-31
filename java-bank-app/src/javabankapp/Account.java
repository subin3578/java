package ch06.prac20.copy;

public class Account {
// Account (int AcNumber, String name, int balance);
	private String AcNumber;
	private String name;
	private int balance;
	
	
	public Account(String acNumber, String name, int balance) {
		AcNumber = acNumber;
		this.name = name;
		this.balance = balance;
	}


	public String getAcNumber() {
		return AcNumber;
	}


	public void setAcNumber(String acNumber) {
		AcNumber = acNumber;
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


	public String goString() {
		return "계좌번호: "+AcNumber+ " 이름: " + name + " 잔액: "+ balance;
		
	}
}

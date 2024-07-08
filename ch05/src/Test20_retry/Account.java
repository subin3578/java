package Test20_retry;

public class Account {
	
	private String ano;
	private String aname;
	private int balance;
	
	public Account(String ano, String aname, int balance) {
		this.ano = ano;
		this.aname = aname;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String toString() {
		return ano +"  "+ aname+"  " + balance;
	}

}

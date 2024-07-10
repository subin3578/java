package sub4;

public class StockAccount extends Account{
	
	private String stockName;
	private int amount;
	private int price;
	
	public StockAccount(String bank, String acc, String name,int balance, String stockName, int amount, int price){
	
		super(bank, acc, name, balance);
		this.stockName = stockName;
		this.amount =amount;
		this.price = price;
	
	}

	public void buy(int amount,int price) {
		this.amount +=amount;
		this.balance -= amount*price;
	} 
	public void sell(int amount,int price) {
		this.amount -= amount;
		this.balance += amount*price;
	} 
	public void show(){
		super.show();
		System.out.println("주식종목: "+stockName);
		System.out.println("주식수량 "+amount);
		System.out.println("현재가격: "+price);
	}
}

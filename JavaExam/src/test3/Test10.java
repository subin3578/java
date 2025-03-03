package test3;
/*
 * 날짜 : 2024/07/11
 * 이름 : 황수빈
 * 내용 : 추상클래스, 다형성 문제
 */
interface Buyer{
	public void buy();
}

interface Seller {
	public void sell();
}

class Customers implements Buyer, Seller{

	@Override
	public void sell() {
		System.out.println("판매하기");
		
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
	}
	
}

public class Test10 {
	public static void main(String[] args) {
		Buyer buyer = new Customers();
		Seller seller = new Customers();
		
		buyer.buy();
		seller.sell();
	}

}

package sub4;

/*
 * 날짜 : 2024/07/09
 * 이름 : 황수빈
 * 내용 : 클래스 상속 실습하기
 */

public class inheritanceTest {
	
	public static void main(String[] args) {
		
		// 상속 객체 생성
		Sedan sonata = new Sedan("소나타","흰색",0,2000);
		sonata.speedUp(100);
		sonata.speedDown(40);
		sonata.show();
		
		System.out.println();
		
		Truck bongo = new Truck ("봉고","남색",0,1000);
		bongo.speedUp(100);
		bongo.speedDown(20);
		bongo.show();
		System.out.println();
		//stockAccount(bank, acc, name, balance, stock, amount, price)
		StockAccount kb = new StockAccount("KB증권","101-11-1001","홍길동",10000,"삼성전자",0,50000);
		kb.deposit(1000000);
		kb.buy(10,50000); // buy(amount, pirce)
		kb.sell(5,50000);
		kb.show();
		System.out.println();
		
		
		//person 클래스 상속 실습
		Doctor kim = new Doctor ("김진호",34,"소아과");
		kim.work();
		
		Engineer hwang = new Engineer ("황수빈",26,"컴퓨터");
		hwang.work();
		
	}
	
	
}

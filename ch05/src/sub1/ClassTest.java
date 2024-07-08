package sub1;
/*
 * 날짜 : 2024/07/08
 * 이름 : 황수빈
 * 내용 : java 클래스 실습 
 */
public class ClassTest {
	public static void main(String[] args) {
		
		//객체 생성
		Car sonata = new Car();
		
		//객체 초기화  => 추후에는 생성자로 생성과 초기화 동시에 함
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;

		//객체 활용
		sonata.speedUp(100);
		sonata.speedDown(20);
		sonata.show();
		
		Car avante = new Car();
		
		avante.name = "아반떼";
		avante.color = "블랙";
		avante.speed = 0;
		
		avante.speedUp(80);
		avante.speedDown(20);
		avante.show();
		//Stack 에 새로운 new 객체 선언 Sonata, Avante(참조변수) 생성 후 
		//stack엔 힙영역의 인스턴스 주소입력(포인팅) 
		//⇒ 힙 영역의 인스턴스(클래스로부터 생성된 메모리상의 객체)에 각 정보가 저장됨
		
		//Account 객체 생성
		Account kb = new Account();
		
		kb.bank = "국민은행";
		kb.acc = "101-21-1001";
		kb.name = "김유신";
		kb.balance = 10000;
		
		kb.deposit(40000);
		kb.withdraw(30000);
		kb.show();

		System.out.println();
		
		Account wr = new Account();
		
		wr.bank = "우리은행"; 
		//직접 참조방식 => 은닉이 안됨 => 캡슐화 필요
		wr.acc = "101-22-1001";
		wr.name = "김춘추";
		wr.balance = 20000;
		
		wr.withdraw(5000);
		
		wr.show();
	}
}


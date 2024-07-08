package sub2;
/*
 * 날짜 : 2024/07/08
 * 이름 : 황수빈
 * 내용 : 캡슐화 실습
 */
public class EncapsTest {
	
	public static void main(String[] args) {

	// Car sonata =new Car();
		
	/*	sonata.name = "소나타"; // 직접 참조
		sonata.color = "흰색";
		sonata.speed = 0;
	*/		
		Car sonata = new Car("소나타","흰색",0); // 생성자 사용 선언과 초기화 동시에
	
		sonata.speedUp(80);
		sonata.speedDown(20);
		// sonata.color = "은색"; => 색을 바꾸고 싶어도 수정이 안됨 (속성은 private이라 참조 불가능)
		sonata.setColor("은색");
		sonata.show();
		System.out.println("---------------------");
		
		Car avante = new Car("아반떼","검정",0);
		avante.speedUp(100);
		avante.speedDown(40);
		avante.show();
		System.out.println("---------------------");
		//Account 객체 생성과 초기화

		Account kb = new Account("국민은행","101-21-1001","김유신",10000);
		
		kb.deposit(10000);
		kb.withdraw(5000);
		kb.show();
		System.out.println("---------------------");
		
		Account wr = new Account("우리은행","101-22-1001","김춘추",10000);
		
		wr.deposit(20000);
		wr.withdraw(15000);
		wr.setBank("유리은행");
		wr.show();
		System.out.println("---------------------");
		
		//Book 예제

		Book java = new Book("이것이 자바다","신용권","121-11-1001",3);
		Book sql = new Book("혼자 공부하는 sql","우재남","112-10-1102",2);
		
		if(java.borrowBook()) {
			System.out.println(java.getTitle()+" 1권 대출 성공");
		}else {
			System.out.println("대출 실패");
		}
		
		System.out.println("남은 도서 수: "+java.getAvailableCopies());
		java.show(); 
		}
		
}


package sub5;
/*
 * 날짜 : 2024/07/10
 * 이름 : 황수빈
 * 내용 : 메서드 오버라이딩 실습
 */

class AAA {	
	public void method1() {
		System.out.println("AAAA::method1...");
	}
	public void method2() {
		System.out.println("AAAA::method2...");
	}
	public void method3() {
		System.out.println("AAAA::method3..."); // B와 C에게 상속해줌
	}
}

class BBB extends AAA {
	
	@Override // 기능없음 단지 Annotaion(주석)의 역할
	public void method2() {
		System.out.println("BBB::method2...");// 오버라이딩 (메서드 재정의)
	}
	public void method3(int a) {
		System.out.println("BBB:method3..."); // 오버로딩 (매개변수 바꿈)
		
	}
}

class CCC extends BBB {
	@Override 
	public void method1() {
		System.out.println("CCC::method1...");// 오버라이딩 (메서드 재정의)
	}
	
	@Override 
	public void method2() {
		System.out.println("CCC::method2..."); // 오버라이딩
	}
	
	public void method3(int a, int b) {
		System.out.println("CCC::method3..."); //오버로딩 (매개변수 바꿈)
	}
}
public class MethodOverridingTest {

		public static void main(String[] args) {
			
			CCC c = new CCC();
			
			c.method1();
			c.method2();
			c.method3(); // C, B에는 매개변수 없는 method3는 존재 X 그래서 A 클래스에서 출력
			c.method3(1); // 매개변수가 하나 있는 method3는 클래스 B에 존재함
			c.method3(1,2); // 매개변수가 두개 있는 method3는 클래스 C에 존재함
		
		
		Sedan sonata = new Sedan("소나타","흰색",0,2000);
		sonata.speedUp(100);
		sonata.show();
		
		Truck bongo = new Truck("봉고","남색",0,1000);
		bongo.speedUp(100);
		bongo.show();
		}
		
}

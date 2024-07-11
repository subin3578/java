package sub09;
/*
 * 날짜 : 2024/07/11
 * 이름 : 황수빈
 * 내용 : 중첩 클래스 실습하기
 */

// 외부 클래스 

class Outer{
	private int x;
	
	public Outer(int x) {
		this.x = x;
	}
	
	public void show() {
		System.out.println("Outer x : "+x);
	}
	
	// 내부 클래스
	class Inner{
		
		private int x;
		public Inner(int x) {
			this.x =x;
		}
		public void show() {
			System.out.println("Inner x : "+x);
			}
	}
}

public class NestedClassTest {

	public static void main(String[] args) {
		// 외부객체 생성
		Outer out = new Outer(1);
		out.show();
		// 내부객체 생성
		Outer.Inner inn = out.new Inner(2);
		inn.show();
		
		
		
		//익명개체 생성 - 인터페이스를 클래스 구현없이 바로 new 생성한 개체
		Person p = new Person() {

			@Override
			public void hello() {
				System.out.println("person hello...");
				
			}
			
		};
		p.hello();
		
		
	}
}

interface Person{
	public void hello();
}

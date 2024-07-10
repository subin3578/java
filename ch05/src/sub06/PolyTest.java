package sub06;
/*
 * 날짜 : 2024/07/10
 * 이름 : 황수빈
 * 내용 : 다형성 실습하기
 * 
 * 다형성 (Polymorphism)
 *  - 정의 : 상속관계에서 부모클래스의 기능을 자식클래스에서 다양한 기능으로 정의하는 특성
 *  - 문법 : 객체(참조변수)의 타입선언을 부모클래스 타입으로 선언하는 것 => 업캐스팅
 *  - 
 */
public class PolyTest {
	public static void main(String[] args) {
	
		// 다형성 적용된 객체 생성(업 캐스팅)
		Animal a1 = new Tiger(); //a1은 객체
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a2.move();
		a3.move();
		
		a1.hunt();
		a2.hunt();
		a3.hunt();
		
		// 다운캐스팅 => 타입비교를 잘하고 해야함
		
		Tiger tiger = (Tiger) a1;
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;
		
		
		tiger.move();
		eagle.move();
		shark.move();
		
		tiger.hunt();
		eagle.hunt();
		shark.hunt();
		
		//객체 타입 비교연산
		if(a1 instanceof Tiger) {
			System.out.println("a1은 Tiger 입니다.");
		}
		if(a2 instanceof Eagle) {
			System.out.println("a2는 Eager 입니다.");
		}
		if(a3 instanceof Shark) {
			System.out.println("a3은 Shark 입니다.");
		}
		
		Animal arr[] = {tiger, eagle, shark};
		// for(A:B) B를 A에 넣어라
		for(Animal animal : arr) {
			animal.move();
			animal.hunt();
		}
		
		//Pet, Dog, Cat 예제
		Dog p1 = new Dog();
		Cat p2 = new Cat();
		
		printSound(p1);
		printSound(p2);

	}

		public static void printSound(Pet pet) {
			pet.makesound();
		}	
}


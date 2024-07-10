package sub7;
/*
 * 날짜 : 2024/07/10
 * 이름 : 황수빈
 * 내용 : 추상 클래스 실습하기
 */

public class AbstrackTest {

	public static void main(String[] args) {
		
		// 추상클래스는 객체 생성 X
		// Animal animal = new animal;
		
		Animal tiger = new Tiger();
		Animal eager= new Eagle();
		Animal shark = new Shark();
		
		tiger.move();
		eager.move();
		shark.move();
		
		tiger.hunt();
		eager.hunt();
		shark.hunt();
		
	}
}

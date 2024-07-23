package sub4;
/*
 * 날짜 : 2024/07/16
 * 이름 : 황수빈 
 * 내용 : MathTest 실습 
 */
public class MathTest {
	public static void main(String[] args) {
		
		// Math 정적 메서드 제공
		
		//기본메서드
		System.out.println("절대값: "+Math.abs(-5));
		System.out.println("제곱근: "+Math.sqrt(9));
		System.out.println("올림값: "+Math.ceil(1.2));
		System.out.println("올림값: "+Math.ceil(1.8));
		System.out.println("내림값: "+Math.floor(1.2));
		System.out.println("내림값: "+Math.floor(1.8));
		System.out.println("반올림: "+Math.round(1.2));
		System.out.println("반올림: "+Math.round(1.8));
		
		//random() - ( 0 ~ 1 사이의 실수) 무작위의 수를 만들 때 사용
		double num1 = Math.random();
		System.out.println("num1: "+num1); // 0 ~ 1 사이의 실수
		
		double num2 = Math.random() * 10; // 0 ~ 10 사이의 실수
		System.out.println("num2: "+num2);
		
		double num3 = Math.ceil(num2); // 올림  1 ~ 10 사이의 정수
		System.out.println("num3: "+num3);
		
		double rand = Math.ceil((Math.random()*10));
		System.out.println(" 1~10까지의 정수를 만드는 함수 " +rand);
		
		//1~46 사이의 정수만드는 법
		System.out.println(" 1~46까지의 정수 랜덤 생성 : "+ Math.ceil((Math.random()*46)));
		
	}
}

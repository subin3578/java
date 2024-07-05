package ch02;
/*
 * 날짜:2024/06/28
 * 이름: 김소진
 * 내용: ch02.변수와 연산자
 */
public class VariableTest {

	public static void main(String[] args) {

		//변수
		int a = 1;
		int b = 2;
		
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		
		a = 3;
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		
		//상수
//		int num = 10;
		final int NUM = 10;
//		NUM = 7;  //상수라 변경 불가
		System.out.println(NUM);
		
		
		
		
	}

}

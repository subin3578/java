package ch02;

/*
 * 날짜: 2024/06/28
 * 이름: 김소진
 * 내용: 변수 자료형 실습하기
 */
public class DateTypeTest {

	public static void main(String[] args) {

		//정수형
		byte num1 = 127;  
		short num2 = 23456;
		int num3 = 1234567;
		long num4 =  12222222222222L;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		//실수형
		float var1 = 0.123456789f;
		double var2 = 0.1234567856789;
		
		System.out.println(var1);
		System.out.println(var2);
		
		//논리형
		boolean data1 = true;
		boolean data2 = false;
		
		System.out.println(data1);
		System.out.println(data2);
		//문자형
		char c1 = 'A';
		char c2 = '가';
		System.out.println(c1);
		System.out.println(c2);
		
		//문자열(참조형)
		String str1 = "A";
		String str2 = "가";
		String str3 = "Apple";
		String str4 = "가을";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}

}

package sub2;

import java.util.Scanner;

public class ThrowsTest {
	public static void main(String[] args) {
		int num =1 ;
		try {
			//method1에서 예외가 발생하면 예외처리
		method1(num);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//method1에서 예외가 발생하면 method을 호출하는 곳으로 예외 던지
	public static void method1(int num) throws Exception {
		method2(num);
	}
	//method2에서 예외가 발생하면 method2를 호하는 곳으로 예외 던지기
	public static void method2(int num) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("num2 입력:  ");
		
		int num2 = sc.nextInt(); //InputMismatchException 발생 
		int result = num/num2;	// ArithmeticException 발생 
		
		System.out.print("result : "+result);
	}

}

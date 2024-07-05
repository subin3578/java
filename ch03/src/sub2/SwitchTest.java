package sub2;

import java.util.Scanner;

/*
 * 날짜: 24/7/1
 * 이름: 김소진
 * 내용: 조건문 switch 실습
 */
public class SwitchTest {

	public static void main(String[] args) {

		System.out.print("숫자 입력: ");
		//콘솔입력
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("입력한 숫자: " + num);
		
		switch(num % 2) {
		case 0:
			System.out.println("num: 짝수");
			break;
			
		case 1:
			System.out.println("num: 홀수");
			break;
			
		}
	}

}

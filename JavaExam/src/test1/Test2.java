package test1;

import java.util.Scanner;

/*
 * 날짜: 24/7/3
 * 이름: 김소진
 * 내용: 자바 자료형 연습문제
 */
public class Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//int year;
		int birth;
		String name;
		
		System.out.println("올해 년도 입력: ");
		int year = sc.nextInt();
		
		System.out.println("태어난 년도 입력: ");
		birth = sc.nextInt();
		sc.nextLine();
		System.out.println("이름 입력: ");
		name = sc.nextLine();
		
		int age = year - birth;
		
		System.out.printf("%s님 안녕하세요. \n당신은 올해 만 %d세 입니다.", name, age);
		
		sc.close();
				
	}

}

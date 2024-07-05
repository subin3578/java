package test1;

import java.util.Scanner;

/*
 * 날짜: 24/7/3
 * 이름: 김소진
 * 내용: 자바 자료형 연습문제
 */
public class Test4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char grade = 0;
		System.out.println("입력한 점수는 " + score + "입니다.");
		
		if(score < 100) {
			grade = 'A';
		}else if(score < 90) {
			grade = 'B';
		}else if(score < 80) {
			grade = 'C';
		}else if(score < 70) {
			grade = 'D';
		}else if(score < 60) {
			grade = 'F';
		}
		System.out.printf("등급은 %c입니다.", grade);
	}
	

}

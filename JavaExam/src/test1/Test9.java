package test1;
/*
 * 날짜: 24/7/3
 * 이름: 김소진
 * 내용: 자바 자료형 연습문제
 */
public class Test9 {

	public static void main(String[] args) {

		int cnt = 0;
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				cnt++;
			}else {
				cnt--;
			}
			for(int j = 1; j <=5-cnt; j++) {
				System.out.println(" ");
			}
			for(int k = 1; k <= 2* cnt-1; k++) {
				System.out.println("*");
			}
			System.out.println("\n");
		}
	}

}

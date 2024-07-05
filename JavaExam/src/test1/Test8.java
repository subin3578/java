package test1;
/*
 * 날짜: 24/7/3
 * 이름: 김소진
 * 내용: 자바 자료형 연습문제
 */
public class Test8 {

	public static void main(String[] args) {

		int n = 5;
		for(int i = 0; i < n; i++) {
		
//			System.out.println();
		
		
		for(int j = 0; j> i; j--) {
				System.out.print(" ");
		}
		for(int k = 0; k < i*2+1; k++) {
			System.out.print("*");
		}
		
		System.out.print("\n");
	}

}
}

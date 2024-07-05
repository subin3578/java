package sub3;
/*
 * 날짜: 24/7/1
 * 이름: 김소진
 * 내용: 조건문 for 실습
 */
public class ForTest {

	public static void main(String[] args) {

		//for
		for(int i = 1; i <= 10; i++) {
			System.out.println("i : " + i);
		}
		//1~10까지 합
		int sum = 0;
		for(int i=1; i<=10; i++) {
			
			sum+=i;
		}
		System.out.println("sus: " + sum);
		//1~10까지 짝수 핪
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("sum:" + sum);
		//for 중첩
		for(int a=1; a<=3; a++) {
			System.out.println("a: "+ a);
			for(int b=1; b <= 5; b++) {
				System.out.println("b: " + b);
			}
		} 
		//구구단
		for(int i=2; i<=9; i++) {
			System.out.print("-----"+i+"단------");
			System.out.println();
			for(int k=1; k<=9; k++) {
				sum = i*k;
				System.out.println(i+"x"+k+"="+sum);
				System.out.print("");
				
			}
		}
		//별삼각형
		for(int start = 10; start >= 1; start--) {
			for(int end = 1; end <= start; end++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}

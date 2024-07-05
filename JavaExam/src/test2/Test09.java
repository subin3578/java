package test2;
/*
 * 날짜 : 2024/07/05
 * 이름 : 황수빈
 * 내용 : 자바 최대공약수 메서드 문제
 */

public class Test09 {

	public static void main(String[] args) {
		
		System.out.println("1과 5의 최대공약수 : "+gcd(1,5));
		System.out.println("3과 6의 최대공약수 : "+gcd(3,6));
		System.out.println("12과 18의 최대공약수 : "+gcd(12,18));
		System.out.println("60과 24의 최대공약수 : "+gcd(60,24));
		System.out.println("192과 162의 최대공약수 : "+gcd(192,162));
	}
	
	public static int gcd(int a, int b) {
		
		if(a>b) {
			int temp;
			temp =a;
			a=b;
			b=temp;
		}
		if(a%b==0) {
			return b;
		}else {
			return gcd(b,a/b);
		}
	}
}

package test2;
/*
 * 날짜 : 2024/07/05
 * 이름 : 황수빈
 * 내용 : 자바 최대공약수 메서드 문제
 */

public class Test10 {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
		System.out.print(fibo(i)+" ");}
		
	}
	
	public static int fibo(int n){
		if (n<=1) {
			return n;
		}
		return fibo(n-2) + fibo(n-1);
	}
}

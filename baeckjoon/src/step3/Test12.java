package step3;


import java.util.Scanner;

// 백준 10951번



public class Test12{
	public static void main(String[] args){
		
	
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) { //입력이 안들어올때까지 한다 *****
			int a = sc.nextInt();
			int b = sc.nextInt();

		
		System.out.println(a+b);
		}
		
		sc.close();
	}
	
}
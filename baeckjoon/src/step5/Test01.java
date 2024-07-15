package step5;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		
		int n = sc.nextInt()-1;
		
		System.out.println(st.charAt(n));
		sc.close();
		}
}

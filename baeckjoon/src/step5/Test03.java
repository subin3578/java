package step5;

import java.util.Scanner;

public class Test03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i=0;i<t;i++) {
			String st = sc.next();
			
	
			System.out.print(st.charAt(0));
			System.out.println(st.charAt(st.length()-1));
		}
	}
}
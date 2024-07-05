package step3;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int n = sc.nextInt();
		int check= 0;
		
		for(int i=0;i<n;i++) {
			int price = sc.nextInt();
			int num = sc.nextInt();
			check += price*num;
		}
	    sc.close();
		System.out.println(check==total?"Yes":"No");
	
	}
}

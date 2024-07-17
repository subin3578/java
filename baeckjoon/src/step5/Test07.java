package step5;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		
		for(int i=0;i<t;i++) {
		
			int r = sc.nextInt();
		String s = sc.next();
		
			for(int j =0;j<s.length();j++) {
				//System.out.print(s); = 오류 발생 ABC 면 AABBCC 가 아닌 ABCABC출력
				for(int k =0 ; k <r ; k++) {
					System.out.print(s.charAt(j));
				}
			}
			
		}

		System.out.println();
		}
	
		
	}


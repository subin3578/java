package step2;

import java.util.Scanner;

public class d {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int res = 0;
	
	int x = sc.nextInt();
	int y = sc.nextInt();
	int z = sc.nextInt();
	
	int max = 0;
	max = x;
	if(max<y){
		max = y;
	}
	if (max<z) {
		max = z;
	}
	System.out.println(max);
	}
}



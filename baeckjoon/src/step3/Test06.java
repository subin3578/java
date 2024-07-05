package step3;
import java.util.Scanner;


public class Test06 {
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int re = N/4;
		for (int i=1;i<=re;i++) {
		System.out.print("long ");
		}
		System.out.println("int");
		sc.close();
	}
	
}

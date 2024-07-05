package step2;
import java.util.Scanner;
public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		int T = sc.nextInt();
		
		int totalM = H*60+M+T;
		int resultH = (H*60+M+T)/60;
		int resultM = totalM - (resultH * 60);
		
		if(resultH>=24) {
			System.out.println(resultH-24+" "+resultM);
		}else {
			System.out.println(resultH+" "+resultM);
		}
		sc.close();
		
		
	}
}

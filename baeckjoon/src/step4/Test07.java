package step4;
//백준 5597번 과제 안낸 사람 ?
import java.util.Scanner;


public class Test07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int check[] = new int[30];
		
		for(int i=0;i<28;i++) {
			int x = sc.nextInt();
			check[x-1]=1;
		}
		
		for(int j=0;j<check.length;j++) {
			if(check[j]!=1){
				System.out.println(j+1);
			}
		}

	}
}
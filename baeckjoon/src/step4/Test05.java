package step4;
//백준 10810번 공넣기
import java.util.Scanner;


public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int arr[] = new int[N];
	
		for(int x=1;x<=M;x++)
		{
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			for(int y = i-1 ; y<=j-1 ; y ++) {
				arr[y] = k;
			}
		}
		
		for(int i=0;i<N;i++) {
		System.out.print(arr[i]+" ");
		sc.close();
	}
}
}
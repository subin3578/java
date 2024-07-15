package step4;
//백준 10810번 공넣기
import java.util.Scanner;


public class Test06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int arr[] = new int[N];
		
		
		for(int x=0;x<N;x++)
		{
			arr[x] = x+1; // 첫번째 바구니 arr[0]에 1을 넣어야하므로 x+1값을 넣어줘야
	
		}
		
		for(int j =0;j<M;j++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
		
			int temp = arr[a-1];
			arr[a-1] = arr[b-1];
			arr [b-1] = temp;
		}
	
		
		for(int k=0;k<N;k++) {
		System.out.print(arr[k]+" ");
		sc.close();
	}
}
}
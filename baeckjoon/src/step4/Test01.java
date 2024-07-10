package step4;

import java.util.Scanner;

// 10807번 scanner이용
public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i =0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int v = sc.nextInt();
		int count = 0;
		
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==v){
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}

package step4;

import java.util.Scanner;

public class Test03{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];

		
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
	
		int max = arr[0];
		for(int k=0;k<N;k++) {
			if(arr[k]>max) {
				max = arr[k];
			}
		}
		int min = arr[0];
		for(int k=0;k<N;k++) {
			if(arr[k]<min) {
				min = arr[k];
			}
		}
		System.out.println(min+" "+max);
		sc.close();
	}
}
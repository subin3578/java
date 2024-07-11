package step4;

import java.util.Scanner;

// 백준 2562번


public class Test04 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int arr[] = new int[9];

		for(int i=0;i<arr.length;i++) {
			int x = sc.nextInt();
			if(x<100) {
				arr[i]=x;
			}else break;
		}
		int max =arr[0];
		for(int k=0;k<arr.length;k++) {
			if(arr[k]>max) {
				max = arr[k];
			}
		}
		System.out.println(max);
		for(int k=0;k<arr.length;k++) {
			if(arr[k]==max) {
				System.out.println(k+1);
			}
		}
		sc.close();
	}
}


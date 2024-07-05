package step3;
import java.util.Scanner;
//구구단
public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int array[] = new int[n];
		
		for(int i = 0;i<n;i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			array [i] = a+b;
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	
		sc.close();
	}
}

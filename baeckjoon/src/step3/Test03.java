package step3;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int total =0;
		for(int i=1;i<=n;i++) {

			total += i;
			}
			System.out.println(total);
			

	}
}

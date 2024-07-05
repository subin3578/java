package step2;
import java.util.Scanner;
public class Test03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println(x>0&&y>0?"1":((x>0&&y<0)?"4":((x<0&&y<0)?"3":((x<0&&y>0)?"2":null))));
		
	}
}

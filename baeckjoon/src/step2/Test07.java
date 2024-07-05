package step2;
import java.util.Scanner;
public class Test07 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x==y&&y==z&&x==z) {
			System.out.println(10000+x*1000);
		}else if (x==y) {
			
			System.out.println(1000+x*100);
		}else if (y==z) {
			
			System.out.println(1000+y*100);
		}else if(x==z) {
			System.out.println(1000+z*100);
		}
		else {
			int max = x;
			if(max<y){
				max = y;
			}
			if(max<z) {
				max = z;
			}
			System.out.println(100*max);
		}
	}
}

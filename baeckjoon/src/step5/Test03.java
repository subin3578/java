package step5;
// 백준 9086번
import java.util.Scanner;

public class Test03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
	
		for(int i=0;i<t;i++) {//string명.charAt(index)의 값이 문자이므로 문자열로 바꾸어준다.
			String st = sc.next();
			String first = String.valueOf(st.charAt(0));
			String last = String.valueOf(st.charAt(st.length()-1));
			
			System.out.println(first+last);
			
		}
	}
}
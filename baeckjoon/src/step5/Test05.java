package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
// 백준 11720번 공백없이 쓰여진 숫자의 합
/* Scanner 이용 => for { charAt(i)-0 ... } 이용
public class Test05{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int sum = 0;
		String st = sc.next();
		
		for(int i=0;i<n;i++) {
			sum += st.charAt(i)-'0';		
		}
		System.out.println(sum);
		
	}
}*/
//BufferedReader 이용 => Integer.parseInt 로 바꿔서 sum
public class Test05 {
	
	public static void main(String[] args) throws IOException{
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int n = Integer.parseInt(br.readLine());
			int sum = 0;
			String[] str = br.readLine().split("");
			br.close();
			
			for(int i=0;i<n;i++) {
				sum+=Integer.parseInt(str[i]);
			}
			System.out.println(sum);
			
		}
}
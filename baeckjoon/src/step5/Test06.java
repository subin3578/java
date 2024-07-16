package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test06{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		int arr[] = new int[26];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = -1;
		}
		
		String str = sc.nextLine();
		
		for(int j=0;j<str.length();j++) {
			char ch = str.charAt(j);
			
			if(arr[ch-'a']==-1) {
				arr[ch-'a'] = j;
			}
		}
		
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]);
		}
		 
		
	}
}
/* 백준 1080번 알파벳 찾기  - BufferedReader 이
public class Test06 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int result[] = new int[26];
		for(int i=0;i<result.length;i++) {
			result[i] = -1;
		}
		
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
			
			if(result[c-'a']==-1) { // a-a=0 result[0]의미 b-a =1 result[1] 의미 (아스키코드)
				result[c-'a']= i; 
			}
			
			
		}
		for(int re : result) {
			System.out.print(re+" ");
		}
	}

}
*/
package step4;
//백준 10811번 바구니 뒤집기 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test09{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
	
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		// 이유는 모르겠으나 반복문 안에서 한번더 StringTokenizer 생성 해줘야 
		// 왜?선생님께 물어보겠다  
		for(int j=0;j<m;j++) {
			st = new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(st.nextToken())-1;
			int y = Integer.parseInt(st.nextToken())-1;
			
			while(x<y) {
				int temp = arr[x];
				arr[x] = arr[y];
				arr[y] = temp;
				x++;
				y--;
				
			}
			
		}
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i] +" ");}
	}
}
 
/* 한번 더 연습해보자 
public class Test09{
		public static void main(String[] args) throws IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int arr[] = new int[n];
			
			for(int i=0;i<arr.length;i++) {
				arr[i]=i+1;
			}
			
			for(int j=0;j<m;j++) {
				st = new StringTokenizer(br.readLine()," ");
		//		int x = Integer.parseInt(st.nextToken());
		//		int y = Integer.parseInt(st.nextToken()) 이렇게 적어서 계속틀렸음 난 배열을 이용중이기 때문에 -1을 필수로 해줘야함
				
				int x = Integer.parseInt(st.nextToken())-1;
				int y = Integer.parseInt(st.nextToken())-1;
				while(x<y) {
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
					x++;
					y--;
				}
				
			}
			for(int x = 0;x<arr.length;x++) {
				System.out.print(arr[x]+" ");
			}
			br.close();
			
		}
}

*/

/*백준 100811 - Scanner 이용(런타임 에러 발생)
package step4;
import java.util.Scanner;
public class Test09 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+1;
		}
		
		
		for(int i=0;i<m;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			//for 문으록 구현하기 힘드므로 조건을 간단히 쓸 수 있는 while문 이용
				while(x<y) {
					int temp = arr[x];
					arr[x]=arr[y];
					arr[y]=temp;
					x++;
					y--;}
		}
		for(int a = 0;a<arr.length;a++) {
		System.out.print(arr[a]+" ");}
		sc.close();
		
	}
}
*/

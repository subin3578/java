package step4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//버퍼는 스트링으로 가지고 있기 때문에 배열로 풀 필요 없음 자체가 문자열
public class Test02 {
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		
		st= new StringTokenizer(br.readLine()); // 다음줄에서 입력받겠다 꼭 넣어 줘야함
		
		for(int i=0;i<N;i++) {
			int input = Integer.parseInt(st.nextToken());
					
			if(input<max) {
				bw.write(input+" ");
			}
		}

		bw.flush();

		
	}
}
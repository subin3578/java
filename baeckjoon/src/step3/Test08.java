package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test08 {
	public static void main(String[] args) throws IOException{
		
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
	
		for(int i=0;i<T;i++)
		{
			st = new StringTokenizer(br.readLine()," ");
			bw.write("Case #"+(i+1)+": ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write(a+" + "+b);
			int result = a+b;
			bw.write(" = "+result+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
		}
		
		
	}
		


		
		


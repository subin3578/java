package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test09 {
	public static void main(String[] args) throws IOException{
		


			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
			int N = Integer.parseInt(br.readLine());
			
			for(int i =1;i<=N;i++) {
				for(int k=1;k<=i;k++) {
					System.out.print("*");
				}
				System.out.println();
			
			}
			br.close();
			bw.flush();
			bw.close();
	}
	}



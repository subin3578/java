package step4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//백준 1546 평균 - BufferedReader 사용  
public class Test10{
	public static void main(String[] args) throws  IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		double max = 0;
		double score[] = new double[n];
		
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i =0 ; i < n; i++) {
			
			score[i] = Double.parseDouble(st.nextToken());
			if(max<score[i]) {
				max=score[i];
			}
		}
//배열을 크기순서대로 정렬할 때 사용
		double total = 0;
		for(int j=0;j<score.length;j++) {
			score[j]= score[j]/max*100;
			total += score[j];
		}
		System.out.println(total/n);
		br.close();
		
	}
}

/*
 * //백준 1546 평균 - Scanner 사용  
public class Test10{
	public static void main(String[] args) throws IOException {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double score[] = new double[n];
		double max =0;
		double total = 0;
		for(int i =0;i<score.length;i++) {
			score[i]=sc.nextInt();
		}

		for(int j=0;j<score.length;j++) {
			if(max<score[j]) {
				max = score[j];
			}
		}
		for(int k=0;k<score.length;k++) {
			{	score[k]= score[k]/max *100;
			
			total += score[k];}
		}
		System.out.println(total/n);
		sc.close();
	}
}*/
 

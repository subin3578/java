package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


//백준 5597번 나머지 => HashSet이 아주 효과적이다
/*
 HashSet
 중복되는 원소를 넣을 경우 하나만 저장한다.
 순서 개념이 없어서 정렬하는 기능인 Collection.sort()메소드 사용 불가
 */

public class Test08 {

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0;i<10;i++) {
			hs.add(Integer.parseInt(br.readLine())%42);}
		
		br.close();
		System.out.println(hs.size());
		}
		}
	

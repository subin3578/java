package sub4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
 * 날짜 : 2024/07/24
 * 이름 : 황수빈 
 * 내용 : Set 실습
 */

public class SetTest {
	
	public static void main(String[] args) {
		
		// Set 생성
		Set<Integer> set = new HashSet<>();
		
		// 데이터 저장 
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(2);
		set.add(3);
		set.add(1);
		
		// 반복자 이용하여 데이터 출력
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			// 다음 데이터가 있을 때 까지 반복해라  
			System.out.println(it.next());
		}
		
		// 반복문 이용하여 데이터 출력 
		for(int num : set) {
			System.out.print(num+" ");
		}
		
	}
}

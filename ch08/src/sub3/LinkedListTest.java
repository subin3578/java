package sub3;

import java.util.LinkedList;
import java.util.List;

/*
 * 날짜 : 2024/07/17 
 * 이름 : 황수빈
 * 내용 : LinkedList 실습 - 빈번한 삽입, 삭제가 이루어질 경우 유리함 
 *
 */
public class LinkedListTest {
	public static void main(String[] args) {
		
		// Linked List 생성 
		
		List<String> cities = new LinkedList<>();
		cities.add("서울");
		cities.add("대전");
		cities.add("대구");
		cities.add("부산");
		cities.add("광주");
		System.out.println(cities);
		
		cities.add(1, "수원");
		System.out.println(cities);
		
		cities.addFirst("인천");
		System.out.println(cities);
		
		cities.addLast("울산");
		System.out.println(cities);
		
	
	}

}

package sub5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * 날짜 : 2024/07/24
 * 이름 : 황수빈 
 * 내용 : Map 실습
 */

public class MapTest {
	public static void main(String[] args) {
	
		// 맵 생성하기 
		HashMap<Character, String> map = new HashMap<>();
		
		// 데이터 입력하기 map.put
		map.put('A',"Apple");
		map.put('B',"Banana");
		map.put('C',"Cherry");
		
		System.out.println(map);
	
		// 맵 크기
		System.out.println("map의 크기 : "+map.size());
		
		// 맵 데이터 출력
		System.out.println("map A값: "+map.get('A'));
		System.out.println("map B값: "+map.get('B'));
		System.out.println("map C값: "+map.get('C'));
		
		// 맵 반복하기 
		for(char k :map.keySet()) { // map의 key를 get으로 반복 
			System.out.println(k+ ": "+ map.get(k));
		
		//ArrayList와 응용
			
		Map <Integer, Apple> map1  = new HashMap<>();
		map1.put(101,new Apple("한국",3000));
		map1.put(102,new Apple("미국",2000));
		map1.put(103,new Apple("일본",1000));
		
		Map <Integer, Apple> map2  = new HashMap<>();
		map1.put(201,new Apple("미국",3000));
		map1.put(202,new Apple("영국",2000));
		map1.put(203,new Apple("호주",1000));
		
		Map <Integer, Apple> map3  = new HashMap<>();
		map1.put(301,new Apple("대만",3000));
		map1.put(302,new Apple("태국",2000));
		map1.put(303,new Apple("인도",1000));
		
		List<Map<Integer,Apple>> applemaps = new ArrayList<>();
		applemaps.add(map1);
		applemaps.add(map2);
		applemaps.add(map3);

		// 한국 사과 show
		Map<Integer, Apple> resultMap = applemaps.get(0);
		Apple koreaapple = resultMap.get(101);
		koreaapple.show();
		// 호주 사과 
		applemaps.get(1).get(203).show();
		//태국 사과
		applemaps.get(2).get(302).show();
		
		
		
		}
		
	}

}

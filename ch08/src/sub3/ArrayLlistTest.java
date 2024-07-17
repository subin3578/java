package sub3;
import java.util.ArrayList;
import java.util.List;

public class ArrayLlistTest {
	public static void main(String[] args) {
		
		// ArrayList 생성 
		List<Integer> list = new ArrayList<>();
		
		// 데이터 저장 list.add(value)
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		// {1,2,3,4,5}
		
		// 데이터 삽입 list.add(index, value)
		list.add(1,6);
		System.out.println(list);
		// {1,6,2,3,4,5}
		
		// 데이터 삽입 list.remove(index)
		list.remove(2); //index 2 제거
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		
		// 데이터 출력 
		System.out.println("list 1번째 원소 : "+list.get(0));
		System.out.println("list 2번째 원소 : "+list.get(1));
		System.out.println("list 3번째 원소 : "+list.get(2));
		
		// 리스트 크기
		System.out.println("리스트 사이즈 : " + list.size()); 
		// 리스트 출력은 반복문(for(int i : list){})
		for(int num : list) {
			//Integer -> int 언박싱
			System.out.print(num+" ");
		}	
		System.out.println();
		
		//
		List<String> people = new ArrayList<>();
		
		people.add("김유신");
		people.add("김춘추");
		people.add("장보고");
		people.add("강감찬");
		people.add("이순신");
		System.out.println(people);
		
		//마지막에 정약용
		
		people.add("정약용"); // 마지막에 추가하는 법
		System.out.println(people);
		
		people.add(4,"이성계");
		System.out.println(people);
		// 김춘추 자리에 선덕여왕 넣어라
		people.add(people.indexOf("김춘추"),"선덕여왕");
		System.out.println(people);
		
		people.remove(people.indexOf("장보고"));
		System.out.println(people);
		
		people.add(3,"왕건");
		System.out.println(people);
		
		// 이성계를 정도전으로 교체 - 'set'사용 
		people.set(people.indexOf("이성계"), "정도전" );
		System.out.println(people);
		
		// 객체 리스트 
		List<Apple> apples = new ArrayList<>();
		
		Apple a1 = new Apple("한국",3000);
		Apple a2 = new Apple("미국",2000);

		apples.add(a1);
		apples.add(a2);
		apples.add(new Apple("일본",1000));
		
		Apple applekorea = apples.get(0);
		System.out.println(applekorea);
		System.out.println((apples.get(2)));
		
		}
}


package sub4;
/*
 * 날짜 : 2024/07/23
 * 이름 : 황수빈
 * 내용 : 자바 컬렉션 스트림 맵 실습하기
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}


public class StreamMapTest {
	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		people.add(new Person ("김유신",23));
		people.add(new Person ("김춘추",21));
		people.add(new Person ("장보고",33));
		people.add(new Person ("강감찬",43));
		people.add(new Person ("이순신",53));
		
		
		// map 스트림
		List<String> names = people.stream()
				  					.map((person)->{
				  						return person.getName(); //새로운 데이터로 다음 스트림에 전달
				  						})
				  					.collect(Collectors.toList());

		System.out.println(names);
		// flatMap 스트림
	
		List<E> lists = List.of(
			ㄴㄴㄴ				Arrays.asList("apple","banana"),
							Arrays.asList("cherry","grape"),
							Arrays.asList("orange","mango")
							);
		System.out.println(lists);

		List<String> fruits = lists.stream()
									.flatMap((list)->{
										return list.stream();
									})
									.collect(Collectors.toList());
		
		System.out.println(fruits);
	}
}

package sub1;

public class ObjectTest {
	public static void main(String[] args) {
	
		Apple a1 = new Apple("한국",3000);
		Apple a2 = new Apple("일본",2000);
		
		// 객체 정보 조회 - toString()
		System.out.println(a1); // toString() 호출
		System.out.println(a2); // toString() 호출
		
		// equals() - 객체 비교
		if(a1==a2) { // 이건 스택에 저장된 주소값을 비교하게 된다
			System.out.println("a1, a2가 주소값(참조값) 같다.");
		}else {
			System.out.println("a1, a2가 주소값(참조값) 다르다.");
		
		}
		
		if(a1.equals(a2)) {// 이건 객체 자체를 비교한다 => String 문자열은 이걸로 써야함 ************
			System.out.println("a1, a2가 객체가 같다.");
		}else {}
			System.out.println("a1, a2가 객체가 다르다.");
		
		// 객체 해시값(유일값) - hashCode()
		System.out.println("a1의 해시값 : "+a1.hashCode());
		System.out.println("a2의 해시값 : "+a2.hashCode());
	}
}

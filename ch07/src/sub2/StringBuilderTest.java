package sub2;
/*
 * 날짜 : 2024/07/16
 * 이름 : 황수 
 *  내용 : 자바 StringBuilder 클래스 실습하기
 */
public class StringBuilderTest {

	public static void main(String[] args) {
		
		String str = "java";
		System.out.println("str 주소 : " + System.identityHashCode(str));
		
		str += "Programming";
		System.out.println("str 주소 : "+ System.identityHashCode(str));
		
		// String 불변(immutable)임 왜? 변경이 일어나면 또 다른 객체를 생성하여 사용하기 때문
		// 그래서 변경이 일어난  두개의 'str' 주소가 다름 
		
		
		
		StringBuilder sb= new StringBuilder("java");
		
		System.out.println("sb의 주소 : "+System.identityHashCode(sb));
		
		sb.append("Programming"); // 뒤에 더붙여줌

		System.out.println("sb의 주소 : "+System.identityHashCode(sb));
		// String 불변 특성을 개선한 StringBuilder = > 두개의 'str' 주소값이 똑같음
	}

}

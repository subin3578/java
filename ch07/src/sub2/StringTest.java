package sub2;
/*
 * 날짜 : 2024/07/16
 * 이름 : 황수빈
 * 내용 : String 메서드
 */
public class StringTest {

	public static void main(String[] arg) {
		
		//문자열 (문자 + 배열)생성
		// 스택에 주소값이 저장되어 있음
		String str1 = "Hello"; // 리터럴 문자열
		String str2 = new String("Hello"); //객체 생성
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : "+str2);
		
		
		//문자열 비교 - 무조건 .equals !!!!!
		if(str1==str2) {
			System.out.println("str1, str2 주소값 같다. ");
		} else {System.out.println("str1, str2 주소값 다르다. ");
		}
		if(str1.equals(str2)) {
			System.out.println("str1, str2 문자열 같다.");
			
		}else {			System.out.println("str1, str2 문자열 다르다.");
		}
		// 문자열 길
		String message = "Hello,korea"; // 배열에서는 배열명.length
		System.out.println("message 길이 : "+message.length()); //야는 메서드임
		
		/// 문자열 추출
		char c1 = message.charAt(0);
		char c2 = message.charAt(6);
		
		System.out.println("첫번째 문자: "+c1);
		System.out.println("일곱번째 문자: "+c2);
		
		// 문자열 자르기
		String sub1 = message.substring(0,5);
		String sub2 = message.substring(6);
		
		System.out.println("문자열 1번에서 6번까지 : "+sub1);
		System.out.println("문자열 6번에서 끝까지 : " +sub2);
		
		//문자열 인덱스(몇번째 문자냐?)
		int idx1 = message.indexOf("e");
		int idx2 = message.lastIndexOf("e");
		
		//문자열 분리 -> 반환타입이 문자열 배열 String[] 
		String[] result = message.split(",");
		for(String str : result) {
			System.out.println("str :"+str);
		}
		
		//문자열 교체
		String rs1 = message.replace("korea","busan");
		String rs2 = message.replace("hello","welcome");
		
		System.out.println(rs1);
		System.out.println(rs2);
		 
		//문자열 변환 (타입변)
		int var1 = 1;
		double var2 = 3.14;
		boolean var3 = true;
		
		// 기본타입 => 문자열 String.valueOf()
		String s1 =  String.valueOf(var1);
		String s2 =  String.valueOf(var2);
		String s3 = ""+var3; // 이렇게도 많이 사용함 ***
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		
	}
}


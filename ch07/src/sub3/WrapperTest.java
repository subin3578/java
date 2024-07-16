package sub3;
/*
 * 날짜 : 2024/07/16
 * 이름 : 황수
 * 내용 : 자바 Wrapper클래스 실습하기
 */
public class WrapperTest {
	public static void main(String[] args) {
		
		
		//기본타입 - 객체로 Boxing 
		int var1 =1 ;
		double var2 = 3.14;
		boolean var3 = true;
		
		

		Integer box1  = var1;
		Double box2 = var2;
		Boolean box3 = var3;
		
		System.out.println("box1: " + box1);
		System.out.println("box2: " + box2);
		System.out.println("box3: " + box3);
		
		String str1 = "1";
		String str2 = "3.14";
		String str3 = "false";
		
		// 문자열 - 기본타입으로 변환
		int value1 = Integer.parseInt(str1);
		double value2 = Double.parseDouble(str2);
		boolean value3 = Boolean.parseBoolean(str3);
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		
		// 문자열 - Wrapper 변환 //BOXING
		Integer w1 = Integer.valueOf(str1);
		Double w2 = Double.valueOf(str2);
		Boolean w3 = Boolean.valueOf(str3);
	
		System.out.println("w1 : "+w1);
		System.out.println("w2 : "+w2);
		System.out.println("w3 : "+w3);
		
		
		// Wrapper - 문자열 변환
		String s1 = w1.toString(); // w1 는 Wrapper
		String s2 = w2.toString();
		String s3 = w3.toString();
		
		
		// Wrapper - 기본타입 변환  // UNBOXING
		int r1 = w1;
		double r2 = w2;
		boolean r3 = w3;
		
		// 기본타입 - Wrapper 변환
		Integer wr1 = r1;
		Double wr2 = r2;
		Boolean wr3 = r3;
		
		System.out.println("w1: "+wr1);
		System.out.println("w2: "+wr2);
		System.out.println("w3: "+wr3);
	}
	

}

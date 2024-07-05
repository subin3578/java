package sub3;

/*
 * 날짜: 24/7/2
 * 이름: 김소진
 * 내용: 메서드 형태 실습
 */
public class MethodTypeTest {

	public static void main(String[] args) {
		
		MethodTypeTest type = new MethodTypeTest();
		double t1 = type.type1(5.0);
		System.out.println(t1);
		
		type.type2(false);
		
		boolean t3 = type.type3();
		System.out.println(t3);
		
		type.type4();
	}
	
	//타입1- 매개변수 o, 리턴값 o
	public  double type1(double x) {
		double y =	(x * x) * Math.PI;
		return y;
	}
	//타입2- 매개변수 o, 리턴값 x
	public void type2(boolean status) {
		if(status) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	//타입3- 매개변수 x, 리턴값 o
	public boolean type3() {
		int num1 = 1;
		int num2 = 2;
		
		if(num1 > num2) {
			return true;
		}else {
			return false;
		}
		
	}
	//타입4- 매개변수 x, 리턴값 x
	public void type4() {
		double result = type1(5.0);
		System.out.println("반지름 길이가 5인 원의 넓이: " + result);
	}

}

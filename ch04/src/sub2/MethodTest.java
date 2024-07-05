package sub2;

/*
 * 날짜: 24/7/2
 * 이름: 김소진
 * 내용: 메서드 실습
 */
public class MethodTest {

	public static void main(String[] args) {
		MethodTest test = new MethodTest();
		int y1 = test.f(1);  //인자값 1을 전달해서 f메서드 호출
		int y2 = test.f(2);
		int y3 = test.f(3);
		
		
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(y3);

		int sum1 = test.sum(1, 5);
		System.out.println("sum:"+sum1);
	}
	
	public int f(int x) {  //전달되는 인자값을 매개변수 x로 받아서 메서드 실행
		int y = 2 * x + 3;
		
		return y;  //메서드를 호출한 곳으로 반환값 리턴
	}

	//메서드 정의
	public int sum(int start, int end) {
		//지역변수: 메서드 안에서 선언된 변수
		int total = 0;
		for(int i=0; i<= end; i++) {
			total+=i;
		}
		return total;
	}
}

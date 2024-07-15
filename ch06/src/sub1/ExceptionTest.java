package sub1;
/*
 * 날짜 :2024/07/15
 * 이름 : 황수빈
 * 내용 :예외처리 실습하기
 */
public class ExceptionTest {
	public static void main(String[] args) {
		/////////////////////////////////////
		///실행예외(런타임, 프로그램 실행 중 발생 예)
		// 예외 상황 1) 어떤 수를 0으로 나눌 때
		int num1 =1;
		int num2 =0;
		
		
		int r1= num1+num2;
		int r2= num1-num2;
		int r3= num1*num2;
		int r4= 0;
		
		System.out.println("r1: "+r1);
		System.out.println("r2: "+r2);
		System.out.println("r3: "+r3);
		System.out.println("r4: "+r4);
		
		try {
			//예외가 발생할 코
			r4 = num1/num2;
		}catch(ArithmeticException e) {
			//예외가 발생 했을 때 
			e.printStackTrace();}
		
	
		// 예외 상황 2) 배열의 인덱스 참조가 잘못되었을 때
		int[] arr = {1,2,3,4,5,};
		try {
			for(int i =0;i<=10;i++) {
				System.out.println("arr["+i+"] : " +arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		// 예외 상황 3) 객체 생성 없이 메서드 호출
		Animal ani = null;
	
		try {
			ani.move();

		}catch(NullPointerException e) 
		{	e.printStackTrace();
		}
		
		// 예외 상황 4) 잘못된 캐스팅 
		
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark(); //업캐스팅
		

		try {
			Tiger tiger = (Tiger) a1;
			Shark shark = (Shark) a2;
			
			tiger.move();
			shark.move();
		}catch(ClassCastException e) {
			e.printStackTrace();
			
		}
	
		
		System.out.println("프로그램 종료");
	}
}

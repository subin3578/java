package sub2;

/*
 * 날짜 : 2024/07/22
 * 이름 : 황수빈
 * 내용 : 스레드 상태 실습
 */

class Sub1Thread extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0 ; i<1000 ; i++) {
			
			System.out.println("Sub1 Thread 실행 ..."+i);
			
			Thread.yield();
		}
	}
}

class Sub2Thread extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0 ; i<1000 ; i++) {
			
			System.out.println("Sub2 Thread 실행 ..."+i);
		}
	}
}
public class ThreadYeildTest {
	
	public static void main(String[] args) {
		
		Sub1Thread sub1 = new Sub1Thread();
		Sub2Thread sub2 = new Sub2Thread();
		
		sub1.start();
		sub2.start();
		
		System.out.println("main Thread 종료 ...");
	}

}

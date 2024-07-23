package sub2;
/*
 * 날짜 : 2024/07/22
 * 이름 : 황수빈
 * 내용 : Thread Join 실습
 * */

class WorkThread extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0 ; i<10 ; i++) {
			
			System.out.println("Work Thread 실행 ...");
			
			try {
				Thread.sleep(1000); // 스레드 1초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Work Thread 종료 ...");
		
		
	}
}
	

public class ThreadJoinTenst {
	
	public static void main(String[] args) {
		WorkThread work = new WorkThread();
		
		work.start(); 
		// join을 적기 전 메인스레드가 먼저 끝난 뒤 자식 클래스가 실행되는데 이렇게 되면 자식클래스가 좀비클래스가 됨
		// join을 추가하면 main이 실행 종료 되지 않고 자식 스레드가 조인하기를 기다려준다.
		
		try {
			work.join(); // 스레드 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main Thread 종료 ...");
	}

}

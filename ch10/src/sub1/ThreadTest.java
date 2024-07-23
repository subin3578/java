package sub1;
/*
 * 날짜 : 2024/07/22
 * 이름 : 황수빈
 * 내용 : Java Thread 실습 
 */
public class ThreadTest {

	public static void main(String[] args) {
		SubThread sub1 = new SubThread("sub1");
		SubThread sub2 = new SubThread("sub2");
		
		//sub1.run();
		//sub2.run(); // 싱글 스레드
		// 작업 스레드 시작
		sub1.start();
		sub2.start(); // 멀티 스레드 = 병행 실행
		
		for(int i=0;i<10;i++) {
			System.out.println("main Thread 실행 ...");
			
			try {
				Thread.sleep(1000); // 스레드 1초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("main Thread 종료 ...");
	}
}

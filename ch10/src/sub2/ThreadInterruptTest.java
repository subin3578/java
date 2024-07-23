package sub2;
/*
 * 날짜 : 2024/07/22
 * 이름 : 황수빈
 * 내용 : Thread 상태 실습 
 */

class SubThread extends Thread{
	
	@Override
	public void run() {
		
		int i = 1;

				try {
					for(;;) {
				System.out.println("Sub Thread 실행 ..."+i);
				
				i++;
				Thread.sleep(1000); // 스레드 1초 대기
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}


public class ThreadInterruptTest {
	public static void main(String[] args) {
		
		SubThread sub =  new SubThread();
		
		sub.start();
		
		try {
			Thread.sleep(1000*10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 
		sub.interrupt(); // InterruptedException 발생 시켜 작업 스레드 종료
		
		System.out.println("Main Thread 종료..."); 
		
	}

}

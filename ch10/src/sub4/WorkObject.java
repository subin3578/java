package sub4;

public class WorkObject {
	// 동기화 메서드
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+":methodA 작업 실행");
		notify(); // 다른 스레드를 일시정지에서 실행 대기로 만듬
		try {
			wait(); // 자신 스레드를 실행에서 일시정지로 만듬
		}catch(InterruptedException e) {
		}
	} 
	
	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+":methodB 작업 실행 ");
		notify();
		try{
			wait();
		}catch(InterruptedException e) {
		
		}
	}
}

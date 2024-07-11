package sub8;

/*
 날짜 : 2024/07/11
 이름 : 황수빈
 내용 : 인터페이스 실습하기
 
	인터페이스
	- 표준화된 클래스 설계에 사용되는 구조체
	- 오직 추상메서드만을 가짐	
	- 인터페이스를 활용하여 다형성을 구현하고 객체간 결합도를 완화 
*/

class Computer {
	public void boot() {
		System.out.println("컴퓨터 부팅중...");
	}
}
interface Internet{
	public void access();
}

class Tv extends Computer implements Internet{
	public void show() {
		System.out.println("TV 시청...");
	}

	@Override
	public void access() {
		System.out.println("인터넷 접속...");
		
	}
} // 가능은 하지만 권장되는 방법이 아님

public class InterfaceTest {

	public static void main(String[] args) {
		
		//인터페이스 실습1 - 표준화된 클래스 설계
		RemoteControl lg = new RemoteLG(); // 업캐스팅
		lg.powerOn();
		lg.chUp();
		lg.soundUp();
		lg.powerOff();
		
		RemoteControl samsung = new RemoteSamsung();
		samsung.powerOn();
		samsung.chUp();
		samsung.soundDown();
		samsung.powerOff();
		
		//인터페이스 실습2 - 다형성 예제
		Bulb bulb = new Bulb();
		Socket socket1 = new Cable(bulb);
		
		socket1.switchOn();
		socket1.switchOff();
		
		//인터페이스 실습3 - 다중 상속 효과 예제 => 실무에서 권장하지 않음
		
		Tv tv = new Tv();
		tv.boot();
		tv.access();
		tv.show();
		
		Computer tv2 = new Tv();
		tv2.boot();
		// tv2.access(); => 오류 발생
		// tv2.show(); => 오류 발생
		
		Internet tv3 = new Tv();
		//tv3.boot(); => 오류발생
		tv3.access();
		//tv3.show(); => 오류 발생
		
		//=> 다형성이 되지 않음
		
		
	}
}

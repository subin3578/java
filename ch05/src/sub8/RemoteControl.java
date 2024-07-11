package sub8;

/*
	인터페이스
	- 표준화된 클래스 설계에 사용되는 구조체
	- 오직 추상메서드만을 가짐	
	- 인터페이스를 활용하여 다형성을 구현하고 객체간 결합도를 완화 
*/
public interface RemoteControl {

	public abstract void powerOn();
	public abstract void powerOff();
	
	public void chUp(); // Interface 클래스에서는 abstract 생략 가능
	public void chDown();
	
	public void soundUp();
	public void soundDown();
}

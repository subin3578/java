package sub7;


// 추상클래스 - 추상 메서드를 갖는 클래스, 상속을 위한 클래스, 실제 구현 X
public abstract class Animal {
	

	public void move() {
		System.out.println("move ...");
	}
	
	//추상 메서드 - 내용이 없는 메서드 하위클래스의 오버라디으를 위한 메서드
	public abstract void hunt(); // 사용할 하위클래스에서 정의 
	
	public abstract void show();
	
}


package sub5;

//Car 이라는 부모 클래스 밑 Sedan 자식 클래스
public class Sedan extends Car {

	private int cc; //car에 없는 속성 추가
	
	// 생성자 만들기
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed); // 부모님꺼 받아오기
		this.cc = cc;
	}
	
	@Override // 상위클래스에서 상속받은 메서드나 변수를 재정의하여 하위클래스가 사용함
	public void speedUp(int speed) {
		//Sedan에 맞게 speedUp 재정의
		this.speed += speed*cc;
	}
	public void show() {
		super.show();
		System.out.println("배기량: "+cc);
	}
	
}

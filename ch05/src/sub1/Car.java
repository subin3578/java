package sub1;

//Car이라는 클래스 정의
public class Car {

	//속성(멤버 변수) => 모든 객체는 속성이 있다	
	String name;
	String color;
	int speed;
	
	//기능(멤버 메서드 ) => 'Static'은 사용하지 않음
	public void speedUp(int speed) {
		this.speed += speed;
	} 
	//이 Car 클래스의 멤버변수인 'speed'를 참조한다  => this.speed 
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : "+this.name);
		System.out.println("차량색상: "+this.color);
		System.out.println("현재속도: "+this.speed);
		
	}
	
}

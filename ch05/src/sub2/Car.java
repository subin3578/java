package sub2;

//Car이라는 클래스 정의
public class Car {

	//속성(멤버 변수) => 무조건 'private' 사용 
	private String name;
	private String color;
	private int speed;
	
	//생성자(Constructor) : 캡슐화된 클래스 속성을 초기화하는 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	//Setter : 캡슐화된 속성에 대한 추가적인 수정을 위한 메서드
	
	public void setColor(String color) {
		this.color = color;
	}
	
	//Getter
	public String getColor() {
		return color;
	}

	//기능(멤버 메서드) => 'Static'은 사용하지 않음
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

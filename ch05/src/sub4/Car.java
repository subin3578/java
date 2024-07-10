package sub4;

//Car이라는 클래스 정의
public class Car {

	//속성(멤버 변수) => 무조건 'private' 사용 
	//상속관계에서 자식들이 참조(접근)할 수 있도록 'protected'사용
	protected String name;
	protected String color;
	protected int speed;
	
	public static int count;
	
	//생성자(Constructor) : 캡슐화된 클래스 속성을 초기화하는 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
	}
	
	// 클래스 메서드(정적 메서드)
	public static int getTotalCount() {
		return count;
	} 
	/*static 변수를 사용하기 때문에 static 메서드로 만드는 것이 좋음*/
	
	
	//Setter : 캡슐화된 속성을 직접 참조하거나 수정할 수 없기에 생성
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

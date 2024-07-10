package sub4;

public class Truck extends Car{
	
	private int capacity;
	
	public Truck(String name, String color, int speed, int capacity) {
		super(name,color,speed);
		this.capacity = capacity;
		
	}
	public void show() {
		System.out.println("차량명 : "+name);
		System.out.println("차량색 : "+color);
		System.out.println("차량속도: "+speed); // 부모클래스에서 Protected 변수 가져옴
		System.out.println("적재량 : "+capacity);
	}

}

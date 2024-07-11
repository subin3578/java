



class Customer{
	private	int id;
	private	String name;
	protected String grade;
	protected int point;
	protected double pointRatio;	
	protected double saleRatio;
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
		this.grade = "SILVER";
		this.point = 100;
		this.pointRatio = 0.01;
		this.saleRatio = 0;
	}
	public int calcPrice(int price) {
		point += price*pointRatio;
		return price;
	}
	
	public void showInfo() {
		System.out.println("=====================");
		System.out.println("고객번호 : "+id);
		System.out.println("고객이름 : "+name);
		System.out.println("고객등급 : "+grade);
		System.out.println("현재포인트 : "+point);
		System.out.println("포인트 적립률: "+pointRatio);
		System.out.println("=====================");
	}
	
}
class VipCustomer extends Customer{
	

	
	public VipCustomer(int id, String name) {
		
		super(id, name);
		super.grade = "VIP";
		super.point = 1000;
		super.pointRatio = 0.05;
		super.saleRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		point += price*pointRatio;
		return price - (int)(price*saleRatio);
	}
}

class VvipCustomer extends Customer{
	
	public VvipCustomer(int id, String name) {
		super(id, name);
		super.grade = "VvIP";
		super.point = 10000;
		super.pointRatio = 0.1;
		super.saleRatio = 0.5;
		
	}

	@Override
	public int calcPrice(int price) {
		point += price*pointRatio;
		return price - (int)(price*saleRatio);
	}
}

public class Javaexam_test3_test07_addvvip  {
	
	public static void main(String[] args) {
	
		Customer kim = new Customer(1001,"김춘추");
		Customer lee = new VipCustomer(1002,"이순신");
		Customer hwang = new VvipCustomer(1003,"황수빈");
		
		System.out.println("김춘추님이 지불할 금액: "+kim.calcPrice(10000));
		System.out.println("이순신님이 지불할 금액: "+lee.calcPrice(10000));
		System.out.println("황수빈님이 지불할 금액: "+hwang.calcPrice(10000));
		
		kim.showInfo();
		lee.showInfo();
		hwang.showInfo();
		
	}
}



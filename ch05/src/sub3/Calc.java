package sub3;

public class Calc {

	//싱글톤 객체
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	private Calc() {}
	// 다른 곳에서 새로운 생성자 못 만들도록 하려고 선언 => main메서드에서 Calc calc1 = new Calc(); 할 수 없다는 뜻
	
	//******** instance로 생성하고, getter작성 후 private 선언 때리기 ***************
	
	public  int plus(int x, int y) {
		return x+y;
	}
	
	public  int minus(int x, int y) {
		return x-y;
	}
	
	public  int multi(int x, int y) {
		return x*y;
	}
	
	public  int div(int x, int y) {
		return x/y;
	}

}

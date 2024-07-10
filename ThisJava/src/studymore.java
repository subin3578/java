
public class studymore {


}

class Pen{
	protected int amount;
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
class SharpPencil extends Pen{
	private int width;
	
	}
	

class Ballpen extends Pen{
	private String color;
	public int getAmount() {
		return amount;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
class FountainPen extends Pen{
	private String color;

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
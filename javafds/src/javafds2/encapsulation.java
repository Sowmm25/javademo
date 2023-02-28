package javafds2;

public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c=new car();
		c.setColor("blue");
		System.out.println(c.getColor());
	}}
class car{
	private String color;
	private int wheels;
	private boolean customizable ;
	public static String man="Honda";
	public car() {
		wheels=4;
		color="red";
		customizable=true;
	}
	public String getColor() {
		return color;
		
	}
	public void setColor(String color) {
		if(customizable)
			this.color=color;
		
	}
	public int getwheels() {
		return wheels;
	}
	public void setwheels(int wheels) {
		this .wheels=wheels;
	}
}
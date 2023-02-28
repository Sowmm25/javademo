package javafds;

public class multiple_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tv T1=new tv();
		T1.powerOn();
		monitor m=new monitor();
		m.powerOn();
		desktopScreen ds=new desktopScreen();
		ds.start();

	}

}
class electricdevice{
	void powerOn() {
		System.out.println("turned on");
	}
	
}
class tv extends electricdevice{
	void powerOn() {
		System.out.println("Tv screen");
	}
	
}
class monitor extends electricdevice{
	void powerOn() {
		System.out.println("Black screen");
	}
	
}
class desktopScreen implements I1,I2{ //extends tv,monitor{  //here instance of parent electricdevice is also created
	public void start() {
		I1.super.start();
		I2.super.start();
	}
}

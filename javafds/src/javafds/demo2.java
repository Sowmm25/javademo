package javafds;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("static block");
		method1();
		demo2 dem3=new demo2(); //cannont call non static method directly need to use object
		dem3.method2();

	}

	static void method1() {
		System.out.println("static method");
	}
	void method2() {
		//non static method
		System.out.println("non static method");
	}

}

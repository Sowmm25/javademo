package javafds;

public class polymorphism { //taking multiple shapes

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compiletimepolymorphism c=new compiletimepolymorphism();
		c.add(5, 0);
		c.add(1, 9,5);
		c.add(0.567f, 1.567f);
		
		

	}

}
class compiletimepolymorphism{ //this is acheived my method overloading
	void add(int a,int b) {
		int r=a+b;
		System.out.println("result is "+r);
	}
	void add(float a,float b) {
		float r=a+b;
		System.out.println("result is "+r);
	}
	void add(int a,int b,int c) {
		int r=a+b+c;
		System.out.println("result is "+r);
	}
}

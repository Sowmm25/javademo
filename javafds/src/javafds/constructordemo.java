package javafds;

public class constructordemo {
	public constructordemo() {
		System.out.println("custom constructor"); //if it is private we cannot create outside of the class
	}
	static {
		System.out.println("static block");
	}
	{
		System.out.println("non static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println("main method");
           constructordemo j1=new constructordemo();
           constructordemo j2=new constructordemo();
           car n=new car(); //if constructor is made private here we cannot access it 
           System.out.println(n.wheels);// for non static variables object reference is required
    
           System.out.println(car.color);// we can access static variables of other class directly by using class
	       System.out.println(n.man);
	       System.out.println(n.price);
	}
	

}
//public constructordemo(){}  ----default constructor without body and same name as class


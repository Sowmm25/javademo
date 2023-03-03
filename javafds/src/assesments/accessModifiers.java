package assesments;
public class accessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c1 obj1=new c1();
		int a=9;
		//System.out.println(obj1.s); since private keyword is used cannot access outside class
		//obj1.run(a); error
		c2 obj2=new c2();
		System.out.println(obj2.s);
		obj2.run(obj2.s);
		
		c3 obj3=new c3();
		System.out.println(obj3.s);//protected modifiers can be accessed throughout
		//same package but not in different package
		obj3.run();

	}

}
class c1{
	private int s;
	private void run(int s) {
		System.out.println("private modifiers "+s);
	}
}
class c2{
	int s=7;
	void run(int s) {
		System.out.println("public modifier "+s);
	}
}
class c3{
	protected int s=9;
	protected void run() {
		System.out.println("protected modifiers");
	}
	
}

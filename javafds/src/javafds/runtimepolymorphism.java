package javafds;

public class runtimepolymorphism {  //this is method overriding

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Macbook m=new Macbookxl();//here subclass macbookxl is overriding the parent class 
		//macbook m =new Macbook or 
		//macbook m=new Macbookpro here pro instance would be executed at run time
		m.shutdown();
		m.start();

	}

}
class Macbook{
	void start() {
		System.out.println("started..");
	}
	void shutdown() {
		System.out.println("stopped...");
	}
}
class Macbookxl extends Macbook{
	void start() {
		System.out.println(" Macbookxl started..");
	}
	void shutdown() {
		System.out.println("macbookxl stopped...");
	}
}
class  Macbookpro extends Macbook{
	void start() {
		System.out.println("pro started..");
	}
	void shutdown() {
		System.out.println("pro stopped...");
	}
}
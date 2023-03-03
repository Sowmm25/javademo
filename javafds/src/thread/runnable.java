package thread;
public class runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imageprocessor ip=new Imageprocessor();
		Thread t=new Thread(ip);
		t.start();
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				utility.messages("do some work");
			}
		});
		t1.start();
		utility.messages("end main");
		

	}

}
class Imageprocessor implements Runnable{
	@Override
	public void run() {
		System.out.println("processing a image...");
	}
	
	
}
class utility{
public static void messages( String message) {
	System.out.println(Thread.currentThread().getName()+"-"+message);
		
	}
	
}

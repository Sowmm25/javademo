package synchronization;
public class synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		utility.messages("started");
		monitor m=new monitor();
		Thread t=new Thread(new worker(m,"jack"));
		t.setName("T1");
		t.start();
		//try {
		//	t.sleep(9000);
		//}catch(InterruptedException e ) {
		//	e.printStackTrace();
		//}
		Thread t1=new Thread(new worker(m,"ruby"));
		t1.setName("T2");
		t1.start();

	}

}
class worker implements Runnable{
	monitor monitor;
	String name;
	worker(monitor monitor, String name){
		this.monitor=monitor;
		this.name=name;
	}
	@Override
	public void run() {
		monitor.displaygreetings(name);
	}
}
class monitor{
	public void displaygreetings(String name) {
		synchronized(this) { //2 threads will not mix each other try by commenting this
			//to see difference
		for(int i=0;i<=20;i++) {
		utility.messages(i+" how are you "+name+" ?");
		try {
			Thread.sleep(500);
		}catch(InterruptedException e ) {
			e.printStackTrace();
		}
		
	}
}
}
}
class utility{
public static void messages( String message) {
	System.out.println(Thread.currentThread().getName()+"-"+message);
		
	}
	
}
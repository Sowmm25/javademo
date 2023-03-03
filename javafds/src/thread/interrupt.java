package thread;
public class interrupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		utility.messages("start");
		Thread t=new Thread(new worker());
		t.start();
		try {
			Thread.sleep(3000);
			t.interrupt();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		utility.messages("ended");

	}

}
class worker implements Runnable{
	@Override
	public void run() {
		utility.messages("started..");//this is in runnable.java
		for(int i=0;i<=10;i++) {
			utility.messages(""+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				utility.messages("thread interrupted");
			}
		}
		utility.messages("end");
	}
}
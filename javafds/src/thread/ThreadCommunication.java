package thread;
public class ThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myThread m=new myThread();
		Thread t=new Thread(m);
		t.setName("T1");
		t.start();
		synchronized(t) {
			utility.messages("going to wait");
			try {
				t.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			utility.messages("notified");
			utility.messages("total= "+m.total);
		}

	}

}
class myThread implements Runnable{
	int total;
	@Override
	public void run() {
		utility.messages("calculating sum");
		synchronized(this) {
			for(int i=0;i<=20;i++) {
				total+=i;
			}
			utility.messages("calculation completed, notifying...");
			this.notify();
		}
	}
	public int getTotal() {
		return total;
	}
	
}

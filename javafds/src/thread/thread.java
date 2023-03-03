package thread;
public class thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//multithreads allows concurrent operations
		multithread m=new multithread();
		m.start();
		singlethread s=new singlethread();
		s.printhead();
	
	}

}
class singlethread{
	void printhead() {
		for(int i=0;i<=20;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(1000); //this sleep can be interupted before 1000 ms
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class multithread extends Thread{
	public void run() {
		for(int i=0;i<=20;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

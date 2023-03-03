package thread;

import java.util.Scanner;

public class jointhread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		calculator c=new calculator(n);
		c.start();
		
		try{
			c.join();//Thread.sleep(100);
		}catch(InterruptedException e) { //if sleep is not used sum will show 0
			e.printStackTrace();
		}
		System.out.println("the sum is: "+c.sum());

	}

}
 class calculator extends Thread{
	 int n;
	 int sum;
	 calculator(int n){
		 this.n=n;
	 }
	 public void run() {
		 for(int i=0;i<n;i++) {
			 this.sum+=n;
		 }
		 
	 }
	 public int sum() {
		 return this.sum;
	 }
	
}
//thread identity- each thread gets a name
 //in currentthread() method there is name() method
 //thread.currentthread.name() gives
 //most common way to implement thread is runnableinterface
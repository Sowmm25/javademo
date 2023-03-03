package threads;
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t=new Thread(new Runnable() {
				@Override
				public void run() {
			//synchronized(this) {
			for(int i=1;i<=10;i++) {
				
					utility.messages(" number "+i);
			}}
		});
			
			
	
		
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				//synchronized(this) {
				for(int i=1;i<=10;i++) {
					if(i%2==0) {
						utility.messages("even number "+i);
					}
				}
			//}
			}
			
		});
		
		Thread t2=new Thread(new Runnable() {
			@Override
			public void run() {
				//synchronized(this) {
				for(int i=1;i<=10;i++) {
				if(i%2!=0) {
					utility.messages("odd number "+i);
				}
			//}
			}
			}
			
		});
		
		t.setName("T1");
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.setName("T2");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.setName("T3");
		t2.start();

	}

}

	
		
		
	
class utility{
public static void messages( String message) {
	System.out.println(Thread.currentThread().getName()+"-"+message);
		
	}
	
}

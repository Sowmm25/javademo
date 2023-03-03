package q;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new PriorityQueue<>();
		
		Random random=new Random();
		for(int i=0;i<10;i++) {
			q.offer(random.nextInt(0,10));
		}
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);

	}

}

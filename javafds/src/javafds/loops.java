package javafds;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to print even numbers from 1 to 10
		for(int i=1;i<=10;i++) {    
			if(i%2==0) {            // here i is only valid to this scope
				System.out.println(i);
			}
		}
		//or
		System.out.println("------------");
		for(int l=0;l<=10;l=l+2) {
			System.out.println(l);
		}
		System.out.println("to find sum of even numbers 1 to 10");
		int r=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				r+=i;
			}
			
		}
		System.out.println(r);
		System.out.println("reverse print from 1 to 10");
		for(int j=10;j>=1;j--) {
			System.out.println(j);
		}
		int i=1;
		while(i<6) {
			System.out.println("h");
			i++;
		}

	}

}

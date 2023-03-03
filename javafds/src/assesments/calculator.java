package assesments;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a=9,b=10;
		int s;
		//a=90; error because final is used
		System.out.println("ENter operation");
		Scanner scanner =new Scanner(System.in);
		s=scanner.nextInt();
		if(s==1) {
		calc.sum(a, b);
		}
		
		calc c=new calc(a,b);
		if(s==2) {
			c.sub(a, b);
		}
		if(s==3) {
			c.mult(a, b);
		}
		if(s==4) {
			c.div(a, b);
		}

	}

}
class calc{
	int a,b;
	calc(int a,int b){
		this.a=a;
		this.b=b;
	}
		
	
	public static void sum(int a,int b) {
		System.out.println("sum is "+(a+b));
		
	}
	public void sub(int a,int b) {
		System.out.println("difference is "+(a-b));
	}
	public void mult(int a,int b) {
		System.out.println("product is "+(a*b));
	}
	public void div(int a,int b) {
		float r;
		float p=a;
		float q=b;  //type casting
		//a=(a)f;
		r=(float) a/b;
		System.out.println("division is "+r);
	}
}

package javafds;

public class boxingunboxingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//recording
		//operators
		int a=9;
		System.out.println(a);
		System.out.println(a++);  //these are unary operators
		System.out.println(a);
		System.out.println(++a);
		boolean isselected=false;
		if(isselected) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		int age =17;
		boolean drivingclassattended=true;
		if(age>15 && drivingclassattended) {
			System.out.println("driving license issued");
		}
		else {
			System.out.println("come later");
		}
		String res=(age>15 && drivingclassattended)?"licenseissued":"come later";//ternary operator
		System.out.println(res);
		int p=9;
		int q=10;
		int r=(p>q)?p:q;
		System.out.println(r);
		//or
		System.out.println((p>q)?p:q);
				

	}

}

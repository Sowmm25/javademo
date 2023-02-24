package javafds;

public class datatypesjava {
	byte a=9;
	static int c=8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		datatypesjava n=new datatypesjava();
		System.out.println(n.a);
		System.out.println(c);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		float e=1.23f;
		//typecasting
		//implicit casting -occurs automatically
		//explicit casting-mention explicitly
		byte b=90;
		int a=8;
		b=(byte)a;//explicit casting
		System.out.println(a);//here a is declared inside main
		System.out.println(b);
		
		char c='a';
		System.out.println(c);
		
		int x=c;
		System.out.println(x);

	}

}

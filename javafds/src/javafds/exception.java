package javafds;

import java.io.IOException;
import java.util.Scanner;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divideByZero();
		stringParser();
		nullpointer();
		
	
}
	  //boolean m() throws IOException {
		// throw new IOException("device error");
	private static void stringParser() {
		String s="2";
		//String s="hello";
		//String s=""; //this is nullpointer demo
		try {
		int i=Integer.parseInt(s);
		System.out.println("converted integer "+i);
		//System.out.println("length of string is "+s.length());
		}catch(Exception e) {
			System.out.println("Exception of parseint is: "+ e.getMessage());
		}
	}
	private static void nullpointer() {
		String s=null;
		try {
			System.out.println("length is:"+s.length());
			
		}catch(Exception e) {
			System.out.println("NUll pointer exception is:"+e.getMessage());
		}
	}

	private static void divideByZero() {
		int a,b,d;
		System.out.println("enter numbers...");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		System.out.println("entered number is "+  a);
		b=scanner.nextInt();
		System.out.println("entered number is:"+b);
		
		//exception e=new exception();
		//try {
		//	System.out.println(e.m());
		//} catch (IOException e1) {
			// TODO Auto-generated catch block
		//	e1.printStackTrace();
		//}
		
		try {
		float c=a/b;
		d=a%b;
		System.out.println("remainder is "+d);
		System.out.println("result is "+c);
		}catch(Exception ex){
			System.out.println("Exception occured "+ex.getMessage());
			
			
		}
	}
			
		//}

}

package scannerdem;

import java.util.Scanner;

public class scannerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		scannerdemo2();
		//scannerdemo3();
		System.out.println("hello");
	}
	
	private static void scannerdemo2() {
		int sum=0;
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number: ");
		while(scanner.hasNextInt()) {
			 num=scanner.nextInt();
			sum+=num;
			System.out.println("enter char to exit");
			
			
		}
		System.out.println("sum is"+sum);
		//scanner.close();
		
	}
	private static void scannerdemo3() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter id");
		int id=scanner.nextInt();
		System.out.println("enter salary");
		double sal=scanner.nextDouble();
		System.out.println("id is"+id);
	}

}

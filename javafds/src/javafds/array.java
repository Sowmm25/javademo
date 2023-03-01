package array;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("i");
		int a[]=new int[5];
		a[0]=1;
		a[1]=3;
		a[2]=5;
		a[3]=3;
		a[4]=5;
		int sum=0;
		//int[] a=new int[]{1,3,5,3,5};
		for(int i=1;i<a.length;i++) {
			if(a[i]==5 &&a[i-1]==3) {
				a[i]=0;
			}
		}
		for(int i=1;i<a.length;i++) { //to find sum of even nmbers
			if(a[i]%2==0) {
			
				sum+=a[i];
		
		
			}
		}
		for(int i:a) {
			sum+=(i%2==0)?i:0;
		}

	}
	//public static void arrayObjects() {
		//Employee emp=new 
	//}

}

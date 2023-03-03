package treeset;

import java.util.Set;
import java.io.Serializable;
import java.util.Comparator;
//import java.util.TreeSet;
import java.util.HashSet;

public class TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> inset=new HashSet<Integer>();
		inset.add(5);
		inset.add(2);
		inset.add(9);
		inset.add(1);
		inset.add(1); //sets will not allow duplicates
		System.out.println(inset);//hashset and treeset orders the element acc to its naturaal
		//order
		Set<String> stset=new java.util.TreeSet<String>();
		stset.add("john");
		stset.add("Mary");
		stset.add("jack");
		System.out.println(stset);
//compareTo()  this returns - if o1<o2 + if o1>o2 and 0 if o1=o2
		//natural ordering is done using compareto()
		Set<String> stset2=new java.util.TreeSet<String>(new stringComparator());
		stset2.add("john");
		stset2.add("Mary");
		stset2.add("jack");
		stset2.add("william");
		stset2.add("zoe");
		stset2.add("Mark");
		stset2.add("love");
		System.out.println(stset2);
		Set<Employee> e=new java.util.TreeSet<Employee>(new EmployeeComparator());
		e.add(new Employee(1,"james",2000,1022));
		e.add(new Employee(2,"kames",2000,1022));
		e.add(new Employee(3,"aames",2000,1022));
		System.out.println(e);
	}

}
class stringComparator implements Comparator<String>{
	@Override
	public int compare(String s1,String s2) {
		int l1=s1.length();                    //this is to override compareTo()
		//function
		int l2=s2.length();
		if(l1<l2) {
			return -1;
			
		}
		else if(l1>l2) {
			return 1;
		}
		else {
			//return 1; 
			return s1.compareTo(s2);
		}
	}
	
	
}
class Employee implements Comparable<Employee>{
	int id,aadhar;
	String name;
	int salary;
	Employee(int id,String name,int salary,int aadhar){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.aadhar=aadhar;
	}
	@Override
	public String toString() {
		return this.name+"|"+this.aadhar+"|"+this.id+"|"+this.salary;
	}
   // @Override
   // public int compare(Employee e) {}
    	
	@Override
	public int compareTo(Employee o1) {
		// TODO Auto-generated method stub
    	return this.name.length()<o1.name.length()?-1:this.name.length()>o1.name.length()?1:0;
       
	}
	
}
class EmployeeComparator implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2) {
		//return e1.name.length()<e2.name.length()?-1:e1.name.length()>e2.name.length()?1:1;
	   return e1.name.compareTo(e2.name);
	}
	
}

package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serialization {//process of writing object to the stream

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee emp=new Employee(2,"abc",4500,345);
		//System.out.println(emp);
		//Employee emp2=new Employee(6,"vbc",4500,3457);
		//System.out.println(emp2);
		//FileOutputStream f=null;
		//ObjectOutputStream o=null;
		//try {
		//	FileOutputStream f=new FileOutputStream("C:/java/javafds/src/emp.scr");
		 //   ObjectOutputStream o=new ObjectOutputStream(f);
		 //   Employee emp=new Employee(2,"abc",4500,345);
		 //   o.writeObject(emp);//here automatically tostring() method is called that is
		//to print classname +@+memory address hence @override must be used to override it 
		//and display it in a redable manner
		  //  System.out.println("Serialized");
		    
		//} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//} catch (IOException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
		serialization();
		deserialization();


	}
	public static void deserialization() {
		try (
			FileInputStream f=new FileInputStream("C:\\java\\javafds\\src\\serialization\\emp");
			   ObjectInputStream o=new ObjectInputStream(f);){
			Employee emp=(Employee) o.readObject();
			System.out.println("Object desraialized:"+emp);
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
			   
		
	}
	public static void serialization() {
		try {
			FileOutputStream f=new FileOutputStream("C:\\java\\javafds\\src\\serialization\\emp");
			   ObjectOutputStream o=new ObjectOutputStream(f);
			   Employee emp=new Employee("2","abc","4500","345");
			   o.writeObject(emp);
			   System.out.println("Object serialized");
			   
			
		}catch (FileNotFoundException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
class Employee implements Serializable{
	String id,aadhar;
	String name;
	String salary;
	Employee(String id,String name,String salary,String aadhar){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.aadhar=aadhar;
	}
	@Override
	public String toString() {
		return this.name+"|"+this.aadhar+"|"+this.id+"|"+this.salary;
	}

	
}

package newcolle;

import java.util.ArrayList;

public class newcolle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(50);
		//System.out.println(list);
		System.out.println(list+"\n");
		list.set(2,101);//to change value
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		System.out.println(list.contains(10)); //to search
		ArrayList newlist=new ArrayList<String>();
		newlist.add("gh");
		newlist.add("jk");
		//System.out.println(newlist);

	}





	}



package arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class demo5 {
	public static void main(String[] args) {
	
	//parent class ref and child class obj u will be able to call parent methods
		List<String> obj = new ArrayList<String>();//in this case u will get the methods of all list not arraylist
//		//in this case u will get the methods of all Collection not arraylist
//		Collection<String> obj1 = new ArrayList<String>(); // not used anywher just for demo
////		in this case u will get the methods of all ArrayList 
//		ArrayList<String> obj2 = new ArrayList<String>();
		obj.add("Shiv");
		obj.add("skilling");
		
		for(String s :obj) {
			System.out.println("values from enhanced for loop : "+ s);
		}
		int my_data = obj.size();
		for(int i =0;i<=my_data;i++) {
			System.out.println("Values from normal for loop  : " + obj.get(i));
		}
	}

}

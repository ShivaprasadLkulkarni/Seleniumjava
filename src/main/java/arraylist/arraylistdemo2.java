package arraylist;

import java.util.ArrayList;
import java.util.Iterator;


public class arraylistdemo2 {
	public static void main(String[] args) {
		

		ArrayList obj1 = new ArrayList();
		obj1.add(526);
		obj1.add("S");
		obj1.add("Selenium webdriver");
		obj1.add("Selenium webdriver");
		obj1.add(12.12);
		
	
	Iterator itr =	obj1.iterator();// iterator is an separate interf import ITerator form java.util
 
	while (itr.hasNext())
   {
	Object value = itr.next();
	
	System.out.println("Values are : "+ value);
	   
   }
		
		
		
	}

}

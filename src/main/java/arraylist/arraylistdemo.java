package arraylist;

import java.util.ArrayList;

// array size and type is fixed
// al it is not
// collection = is a framework that provides an architecture
//to store and manipulate the grop of objects
// all the operations that you perform on data such as 
//searching sorting insertion manipulation deletion 
//etc can be peroformed by java collections
//it is an dynamic data structure mmery from heap 
// array list based on data it can accepts
//java collection framework provieds many interface

//Interfaces - Set List Queue Deque map
//Classes Arraylist vector LinkedList Priority Queue,
//HashSet LinkedSet Treeset


// ArrayList
// it uses dynamic array for sorting the values
// it is an class implemented by list interface also it can store duplicate elements
// it maintains insertion order
// allows random access because array works at the index basis
// manipulation is slwo coz a lot of shifting needs to be occured if any element is remover from the al
public class arraylistdemo {
	public static void main(String[] args) {
		
// Creating an object of ArrayList
//		type is not a issues size alo not a issue
		ArrayList obj1 = new ArrayList();
		obj1.add(526);
		obj1.add("S");
		obj1.add("Selenium webdriver");
		obj1.add("Selenium webdriver");// allowing Duplicate
		obj1.add(12.12);
//	    System.out.println(obj1.size());
//		System.out.println(obj1);
		
		int myList = obj1.size();
		
		for (int i=0; i<myList; i++) {
			
			System.out.println("Values from al "+obj1.get(i));
		}
		
		
		
		
	}

}

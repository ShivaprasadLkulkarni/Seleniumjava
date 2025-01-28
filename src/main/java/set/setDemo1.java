package set;

import java.util.HashSet;

//set is an interface in java which extends collection interface
// set doesnot allow duplicate values 
// set is unordered collection
// cant be accesed using index

// set extends collection
// Collection >>>implements - Hash Set,Linked Hash Set, and TreeSet

//HashSet - Stors the elements by using a mechanism called hashing.// It means we can not access using index and contains unique only
//Linked Hash Set - SImilar to Hashset but it maintains insertion order.
// TreeSet maintains ascending order


public class setDemo1 {
	
	public static void main(String[] args) {
		
		HashSet<String> val = new HashSet<String>();
		val.add("xa1");
		val.add("yb2");
		val.add("zc3");
		val.add("shiva");
		val.add("Ad4");
		val.add("be5");
		System.out.println(val);// works on hashing which one is faster it gives that
	//getting particular value like list by index is not possible coz its hashing
		// weritting enhanced for loop
   //		System.out.println(val.get());// unavailble in Hashset
		for (String abc :val) {
			System.out.println(abc);
		}
		// we have trick to convert the set into list and access index wait
		
	}

}

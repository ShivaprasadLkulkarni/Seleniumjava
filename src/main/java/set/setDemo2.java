package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class setDemo2 {
	
	public static void main(String[] args) {
		// as we know map and set are interface we cant create an object we have deal with classes which implements set interface 

//		Set<String> val1 = new Set<String>(); Invalid 
		LinkedHashSet<String> val = new LinkedHashSet<String>();
		val.add("xaaa1");
		val.add("yaab2");
		val.add("aa");
		val.add("a");
		val.add("Ad4");
		val.add("1");
		val.add("shiva");
		val.add("be5");
		System.out.println(val);// lhs provides insertion order
	
		for (String abc :val) {
			System.out.println(abc);
		}		
	}

}

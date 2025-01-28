package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setDemo3 {
	
	public static void main(String[] args) {
//		Set<String> val1 = new Set<String>(); Invalid 
		TreeSet<String> val = new TreeSet(); //maintains acscending order
		val.add("xaaa1");
		val.add("yaab2");
		val.add("aa");
		val.add("a");
		val.add("Ad4");
		val.add("1");
		val.add("shiva");
		val.add("be5");
		System.out.println(val);
	
		for (String abc :val) {
			System.out.println(abc);
		}		
	}

}

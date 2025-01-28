package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setDemo4 {
	
	public static void main(String[] args) {
		Set<String> val = new HashSet();
		val.add("xaaa1");
		val.add("yaab2");
		val.add("aa");
		val.add("a");
		val.add("Ad4");
		val.add("1");
		val.add("shiva");
		val.add("be5");
		System.out.println(val);
//		System.out.println(val.get());// cant access index particular so
// we have trick to convert the set into list and access index wait
		
		ArrayList<String> cl = new ArrayList<String>(val);// passing val as object in here now will get liberty of accessing index 
System.out.println(cl.get(5));//coming in random order but stored in has form 
// this method will be used in selenium window handlers
	}

}

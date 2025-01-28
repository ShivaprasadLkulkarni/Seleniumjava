package map;

import java.util.HashMap;

// map is an interface in java
// map contains key and value pair
// evry value will have key
// Every key and value called as entry
// this map are used in selenium when data stored in excel to access this frameworks aare used esepecially map
// map is easy to use if u have to search update delte elements on the basis of key
// example - search student based on their roll no
// stores null doesnt allow duplicate
// map is an interface
//hashtable hashmaps >e Linked Hashmap are implemented by the interface


// as we know map and set are interface we cant create an object we have deal with classes which implements map interface 

// Hashmap> a class which implemtns the map interface
// also contains values based on the key and only unique elements
// it may have one null key and multiple null values
// Main point it does not store value in order
public class hashmapdemo1 {
	
	
public static void main(String[] args) {
	HashMap<String, String> obj = new HashMap<String, String>();
	obj.put("12","SS");
	obj.put("11","sw");
	obj.put("122","SA");
	obj.put("1212","sass");
	obj.put("1212","qtp");
	obj.put("","");
	System.out.println(obj);// not in order but key value pair is crct
	String val = obj.get("12");// best praactise to store it in variable directly if u call it shows null
	System.out.println("Value from map is :" + val);
}
	

}

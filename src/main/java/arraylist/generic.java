package arraylist;
import java.util.ArrayList;
//  Java nw generic collecton allows u to have only one type of obj type object in collection 
//now it is type safe so typecasting is not required at run time
// Non generic arraylist
// ArrayList al = new ArrayList();

// Generic example of creating java
// ArrayList<String> al = new ArrayList<String>();

// in generic collection we specify the type in angular braces. Now al is forced to have only specified type of obejcts in it
// if u try to add another type of object it gives compile time eror.  
//
public class generic {
public static void main(String[] args) {
	ArrayList<String> Obj1 = new ArrayList<String>();
	Obj1.add("Shiva");
	Obj1.add("Selenium");
	Obj1.add("Selenium WebDriver");
	Obj1.add("Selenium WebDriver IO");
	//Obj1.add(121);// coz of generic we have given string type 
	// enhanced for loop
	for(String abc :Obj1) { // here instead of treating it as object take string coz generic type we have given at time of declaration so can be usen
		System.out.println("Values are : " +abc);
	}
	//Normal forloop
//	int lenght = Obj1.size();
//	
//	for (int i=0; i<=lenght; i++) {
//		System.out.println("Values are : " +Obj1.get(i));
//	}
}
}

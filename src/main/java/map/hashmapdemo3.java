package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class hashmapdemo3 {
	
	
public static void main(String[] args) {// map is parent interface hash map is an clas sit will support
	LinkedHashMap<String, String> obj = new LinkedHashMap<String, String>();
	obj.put("12","SS");
	obj.put("11","sw");
	obj.put("122","SA");
	obj.put("1212","sass");
System.out.println(obj);
	
	for(Map.Entry<String,String>data :obj.entrySet())
	{
	System.out.println("Key from map is : " +data.getKey()+ " and value is "+data.getValue());	
	}
}
	

}

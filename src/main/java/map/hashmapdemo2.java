package map;

import java.util.HashMap;
import java.util.Map;

public class hashmapdemo2 {
	
	
public static void main(String[] args) {
	HashMap<String, String> obj = new HashMap<String, String>();
	obj.put("12","SS");
	obj.put("11","sw");
	obj.put("122","SA");
	obj.put("1212","sass");

	
	for(Map.Entry<String,String>data :obj.entrySet())
	{
	System.out.println("Key from map is : " +data.getKey()+ " and value is "+data.getValue());	
	}
}
	

}

package Programs;

public class Stringcontainsvowels {
public static void main(String[] args) {
	
System.out.println(stringcheckvowel("Shivaprasad L Kulkarni"));

System.out.println(stringcheckvowel("22121lkklklklk"));
System.out.println(stringcheckvowel("AEIOU"));// incase u dont select tolowercase it treat as false
}
	
	public static boolean stringcheckvowel(String input)
	{
		return input.toLowerCase().matches(".*[aeiou].*");
	
	}
}


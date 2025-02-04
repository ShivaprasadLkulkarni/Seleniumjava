package Programs;

public class ReverseString {	

// best practise
	public static void main(String[] args) {
		
	String name = "Apple";
        //ReverseString rv = new ReverseString(); // if static obj need and access thrg it
        System.out.println(ulta(name));
      
}
	public  static String ulta(String input) {
		if(input == null)
			System.out.println("Not vallid");
		
		StringBuilder sb = new StringBuilder();
		
		char[] cs = input.toCharArray();
		
		for (int i=cs.length -1; i>=0; i--)
			sb.append(cs[i]);
		
		return sb.toString();
	}

}
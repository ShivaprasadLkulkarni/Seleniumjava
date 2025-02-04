package Programs;

public class ReverseString2 {
	
	public static void main(String[] args) {
    ReverseString2 rv = new ReverseString2(); // if static obj need and access thrg it
     rv.ulta();
}

	public void  ulta() {
	
		StringBuilder sb = new StringBuilder("apple");
		sb.reverse();
		
		String Str =sb.toString();
		System.out.println("Converted String : "+Str);
		System.out.println(sb);
	}

}
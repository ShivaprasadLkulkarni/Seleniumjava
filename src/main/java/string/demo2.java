package string;

public class demo2 {
	public static void main(String[] args) {
//		StringBuffer is thread safe
//		StringBuilder is not thread Safe
		StringBuilder sb = new StringBuilder("shiva");
		sb.append("Kulkarni");
		System.out.println("after append " +sb);
		
		sb.insert(5, ",");
		System.out.println("after insert " +sb);
		
		sb.replace(3, 6, "java");
		System.out.println("after replace " +sb);
		
		sb.reverse();
		System.out.println("Reversed :" +sb);
		//toString(): Converts the StringBuilder object back into a String.
		String Str =sb.toString();
		System.out.println("Converted String : "+Str);
	}

}

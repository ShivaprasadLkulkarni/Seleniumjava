package string;

public class demo {
	public static void main(String[] args) {
//		StringBuffer is thread safe
//		StringBuilder is not thread Safe
		StringBuffer sb = new StringBuffer("shiva");
//		sb.append("Kulkarni");
//		System.out.println("after append " +sb);
//		
//		sb.insert(5, ",");
//		System.out.println("after insert " +sb);
//		
//		sb.replace(7, 41, "java");
//		System.out.println("after replace " +sb);
		
		sb.reverse();
		System.out.println(sb);
		
		String Str =sb.toString();
		System.out.println("Converted String : "+Str);
	}

}

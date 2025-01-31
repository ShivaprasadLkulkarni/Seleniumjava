package filesio;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filesiodemo2 {
	public static void main(String[] args) {
	
		
		
		try {	
		FileWriter mywriter = new FileWriter("C:\\Users\\Shivaprasad L Kulkar\\Desktop\\fileio\\file1.txt");
		mywriter.write("Hi iam software archithect shivaprasad l kulkarni");
		mywriter.close();
	   System.out.println(" succesfully");
		} catch (IOException e) {
System.out.println("An Error occured");
e.printStackTrace();
		}
		

}}
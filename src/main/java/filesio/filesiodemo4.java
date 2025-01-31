package filesio;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class filesiodemo4 {
	public static void main(String[] args) {
		

	try {
		File obj = new File("C:\\Users\\Shivaprasad L Kulkar\\Desktop\\fileio\\file1.txt");
		Scanner sc = new Scanner(obj);// other than usernput it is also used to read files in an filesio
		while(sc.hasNextLine()) { //hasNextLine() checks if there is another line of input.
			                       //nextLine() is used to actually read the next line.
			String data=sc.nextLine();
			System.out.println(data);
;		}
		sc.close();
	} catch (FileNotFoundException e) {
System.out.println("Error");
e.printStackTrace();
	}
	}

}

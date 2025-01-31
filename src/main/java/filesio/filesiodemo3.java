package filesio;
import java.io.File;
import java.io.IOException;

public class filesiodemo3 {
	public static void main(String[] args) {
		
			File obj = new File("C:\\Users\\Shivaprasad L Kulkar\\Desktop\\fileio\\file1.txt");
			if(obj.exists()) {
				System.out.println("fiel name : "+obj.getName());
				System.out.println("Absolute path : "+obj.getAbsolutePath());
				System.out.println("Writeable : "+obj.canWrite());
				System.out.println("Readble :"+obj.canRead());
				System.out.println("File Size in Bytes :" + obj.length());
				
}else {
				System.out.println("The file doesnot exists");
			}
	}

}

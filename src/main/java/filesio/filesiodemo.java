package filesio;
import java.io.File;
import java.io.IOException;
//CanRead()
//canWrite()
//createNewFile()// creating file
//Delete()
//Exists()
//getName()
///getAbsolutepath()
public class filesiodemo {
	public static void main(String[] args) {
		
		try {
			File obj = new File("C:\\Users\\Shivaprasad L Kulkar\\Desktop\\fileio\\file.txt");
			if(obj.createNewFile()){
				System.out.println("file created : "+obj.getName());
			} else {
				System.out.println("file already exists");
			}
		} catch (IOException e) {
   System.out.println("Error : "+ e);
   e.printStackTrace();
		}
		
	}

}

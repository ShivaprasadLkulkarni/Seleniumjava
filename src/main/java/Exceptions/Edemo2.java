package Exceptions;

import java.awt.Robot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

// java throws keyowrd is used to declare an exception 
// it gives an information to the programmer that there may occur an exception so it is better for the programmer to provide the exception handling code so that normal flow can be maintained
// Exception handling is mainly used to handle the checked exceptions
// whenever u r sure that it doesnot throw run time exception thn u use throws exception for safer side u have to use trycatch

public class Edemo2 {

public static void main(String[] args) throws Exception { // whenever u dono what type exception u can give base exception so it handles not 
	System.out.println("start");
	Thread.sleep(5000);// it comes under compile time exception  whenever u use this line needs to be throws Interprted exception or try catch 
	System.out.println("stop");
	FileInputStream fils = new FileInputStream(""); // if u throw than u are not handling jvm handling exception 

//  try {
//	Robot a = new Robot();
//} catch (AWTException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
	
//	or
	Robot a = new Robot();
}



}

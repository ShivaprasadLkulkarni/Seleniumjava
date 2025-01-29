package Exceptions;
// exeception is abnormal condition, it is abnormal scenario which will stop the execution of current program
   // in technical words exception is an class
// Exception handling is a way to handle runtime/compile time errors
   // Such as IOException , ArthematicExecption and so on
// Main reason of exception handling is to maintain the norma flow of the application
// 
// Exception > IO Exception and SQL Exception > Runtime Exception - Arthimetic,Nullpointer and NumberFormatException
// Types of Exceptions  >

// Checked(Compile Time E)= are checked at compile time
// Unchecked(Run Time E) are not checked at compile time rather they are checked at run time
// Error is an irrecoverable eg OutOfMemoryError, VirtualMachineError,Assertion
//
//  handling Exception -try catch block is used to enclose the code that might throw an exception it must be used within the method

//  Java try block must be followed by either catch or finaly block

//  Syntax
//  Try{
//  code that may exception
// }catch(Exception_class_Name ref) {
//}
//
public class Edemo {
	public static void main(String[] args) {

//		int c=10/2;
		System.out.println("Start");
		try {
			int z=10/0;
			System.out.println("Res : " + z);
		}catch(ArithmeticException e){// exception and obj name instead of e u can give any name
		
			System.out.println("Somethings are wrong in code check exceptions : "+e.getMessage());
			System.out.println("values is lesser than 0 give more than 0");
		}
		
		System.out.println("Stop");

		
	}
	
	

}

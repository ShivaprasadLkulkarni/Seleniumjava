package Exceptions;

import java.util.InputMismatchException;

public class Edemo1 {
	public static void main(String[] args) {
// when u know exception u can put in catch block whenu dono just add multipe catchblocks

		System.out.println("Start");
		
		try {
			int z=10/0;
			System.out.println("Res : " + z);
			}
			
			
		// then this dead code the code will never execute
		catch(ArithmeticException e){// exception and obj name instead of e u can give any name
		
			System.out.println("Somethings are wrong in code check exceptions : "+e.getMessage());
			System.out.println("values is lesser than 0 give more than 0");
		} // if any other e other than arthemic reg :  input this will catch e
		catch(InputMismatchException e1) {
			System.out.println("oops somethings are wrong in code check exceptions messgaes are: "+e1.getMessage());

		}
		catch(Exception ea){ // if u put this in first  parent exception this will only handle controll nevwe got to other catch 
			System.out.println("Oops something went wrong");
		}
		finally {
			System.out.println("Final Block");
			System.out.println("Stop");//doesnt care about exception it just prints
		}
		

		
	}
	
	

}

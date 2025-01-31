package javauntouchedtopics;

import java.util.Scanner;

public class scannerclassuserinp2 {
	public static void main(String[] args) {
	String fname;
	String lname;
	String fullname;
		
	Scanner sc = new Scanner(System.in);// sc is referance variable storing user input in os used as parama
		
	System.out.println("Enter Fname : ");
	fname=sc.next(); 
	
	System.out.println("Enter lname : ");
	lname=sc.next();
	
	sc.close();
	fullname=fname+lname;
	System.out.println("fullname : "+fullname);
	}

}

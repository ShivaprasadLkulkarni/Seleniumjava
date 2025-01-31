package javauntouchedtopics;

import java.util.Scanner;
//method description

// nextBoolean()  for this datatypes
// nextDouble()
// nextFloat()
// nextInt()
// nextLine()
// nextLong()
// nextShort()
// next() for string

public class scannerclassuserinp {
	public static void main(String[] args) {
		int a;
		int b;
		int sum;
		
		Scanner se =new Scanner(System.in);
		System.out.println("Enter First number :");
		a=se.nextInt();
		
		System.out.println("Enter Second number :") ;
		b=se.nextInt();
		
		se.close();
		sum =a+b;
		
		System.out.println("sum of numb : "+sum);
		
		
	}

}

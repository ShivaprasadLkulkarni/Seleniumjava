package Oops ;
// is also called Dynamic method dispatch
//it is part of run time polymorphism or dynamic binding
//when parent class and child class has th same method it is known as method overriding
// paremt class has method name() and child class also has same method name() then this scenario is known as method overriding
// note method shld share same signature

public class overiddingexampleparent {

	
	public void display() {
		System.out.println("Iam in parent class display method");
	}
	
	public void show() {
		System.out.println("Iam in parent class display method");
	}
	
}

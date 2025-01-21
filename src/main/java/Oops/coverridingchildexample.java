package Oops;

public class coverridingchildexample extends overiddingexampleparent{

public static void main(String[] args) {
	
	
	coverridingchildexample obj1 =new coverridingchildexample();
	obj1.display();// child calls
	
	overiddingexampleparent obj2 =new overiddingexampleparent();
	obj2.display();// parent calls
	
	overiddingexampleparent obj3 =new coverridingchildexample();
	obj3.display();// child calls
//	If you have parent class refernce but object of child class u will be able to call child class
//	coverridingchildexample obj4 =new overiddingexampleparent();
//	obj4.display(); //impossible not allows java
	// child class refernces cannot hold parent class obje  ct
}

public void display() {
	System.out.println("Iam in child class display method");// coming from chil class becaus object is chilc class refernce this display is called in obj
}
public void display(String name) {
	System.out.println("Iam in child class display method");
}
}

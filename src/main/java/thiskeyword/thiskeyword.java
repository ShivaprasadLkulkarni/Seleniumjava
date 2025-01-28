package thiskeyword;
// reserved key workd is reserved keyword in java is also known as refernce variable
//that refers to current class onject 

//this keyword can be used with variables and constructor

//1- with variable
// we can use this keyowrd to refer current class instance variable
//2 - with constructor
//using this() to invoke current class constructor
//requriement sasy donot want to create multiple objs but still want all constructors
//to dod this use this keyword
// obj generally calls default constructor lnow in that using this keyword pass parameters then it alos calls that
public class thiskeyword {
	// constructor
	
	public thiskeyword() {
		this("JDBC");//
		System.out.println("loading my drivers");
	}
	public thiskeyword(String name) {
		this(10);
		System.out.println("loading my drivers name is "+name);
	}
	public thiskeyword(int count) {
		System.out.println("loading my drivers count "+count);
	}
	
	public void display() {
		System.out.println("iam in display methods");
	}
	public static void main(String[] args) {
		thiskeyword obj1 = new thiskeyword();
		obj1.display();

	}

}

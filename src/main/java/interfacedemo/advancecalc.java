package interfacedemo;
// in inheritance u use extend for parent class 
// But to use interface in a class u need to use keyword implements and use name and 
//then unimplement the interface methods it creates the body for the method name in interface 
public class advancecalc implements interfacedemocalc {
	
public static void main(String[] args) {
//	scenario1 - child class ref and child class obj
	advancecalc obj = new advancecalc();
	
//  scenario2 - base class ref and base class obj
  //interfacedemocalc obj2 =new interfacedemocalc(); //invalid coz interface cant have body of mrthod so java wont alllow

//	scenario3 - base class ref and child class obj
	interfacedemocalc obj3 =new advancecalc();
	
//  scenario 4
//	childclass ref base class obj
//	advancecalc obj3 = new interfacedemocalc(); //invalid cant create obj of interface 

	
	//tip - you can not create object of an interface because it has an abstract method(are those methods which does not have any body )
//	tip by default in webdriver selenium in left hand side will be having interface by defalt will get methods written by selenium guys
	obj.add();
	obj.sub();
	obj.calculateSin();
	obj.calculateCos();

//	obj3.add();
//	obj3.sub();
//	obj3.calculateSin(); // can't access
//	obj3.calculateCos();


}

public void calculateSin() {
	System.out.println("iam in sinadvance method");
}
public void calculateCos() {
	System.out.println("iam in cosadvance method");
}


public void add() {
	// TODO Auto-generated method stub
	System.out.println("iam in add method"); //mandatory to code here in this blocks
}

public void sub() {
	// TODO Auto-generated method stub
	System.out.println("iam in sub method");
}
}

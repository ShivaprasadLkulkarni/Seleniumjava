package inheritancea;

public class childclas extends inheritancedemo1base{
public static void main(String[] args) {
//	scenario1
//	Child class reference and child class object - this will allow to access all methods of base class and child class
	childclas obj1 =new childclas();
	
//	Scenario 2
//	Base class reference and base class object - this will allow to access all methods of base class only
    inheritancedemo1base obj2 = new inheritancedemo1base();
	
//  Scenario 3 -- imp main entry point vip for interfaces
//	Base class reference and child class obj - this will allow to acces allt the methods of base class only not child class	
    inheritancedemo1base obj3 = new childclas();
   
//  Scenario 4
//	Child class reference and base class obj - this will be invalid scenario child cannot hold parent
//  childclas obj4 = new chiinheritancedemo1baseldclas(); 
    
   //java says reference matters
    obj1.add();
    obj1.sub();
    obj1.mult();
    obj1.div();
	
//	 obj2.add();
//	 obj2.sub();
//	 obj2.mult(); cannot access child class method
//	 obj2.div();
	
//	 obj3.add();
//   obj3.sub();
//	 obj3.mult();
//	 obj3.div(); cannot access child class method
	
}
	public void mult() {
		
		System.out.println("Hy iam in child class and multi is 21");
	}
	public void div() {
		
		System.out.println("Hy iam in child class and division is 12");
	}
}

package Oops;


class A{ //superclass
	int i;
	public void show() {
	System.out.println("in A " + i);
}
}

class B extends A{//sub class
	int i;
	@Override // suppose  if we make an mistake in method name it shows compile time error
	public void show() {
//	super.i=8;//when u wnat to assign for superclass variable usesuper.keyword
	i=8;//whenu want to assign for sublclass use only variable
	
	super.show();//when u want to invoke the output from method superclass super is keywors which we represent a superclass method
	System.out.println("in B "+ i) ;
//	System.out.println("I values : "+ i);
}
}

public class overridedemo {
	

	public static void main(String[] args) {
	//creating object of subclass
	B obj =new B();//it alos gives constructor of superclss
	obj.show();

}
 
}
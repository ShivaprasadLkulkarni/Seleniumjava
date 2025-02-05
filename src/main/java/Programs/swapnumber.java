package Programs;

public class swapnumber {
// swap number without using another variable
public static void main(String[] args) {
	int a = 10;
	int b = 20;
	
	System.out.println("Value of a before Swapping : "+a);
	System.out.println("Value of b before Swapping : "+b);
	
	a = a+b;//30
	b = a-b;//10 here previous step a value adds on 
//	a = a+b;//40//na
	a = a-b;//20
	System.out.println("Value of a after Swapping : "+a);
	System.out.println("Value of b after Swapping : "+b);
}
}

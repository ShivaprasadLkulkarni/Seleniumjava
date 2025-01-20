package Oops;

public class studentexampleforconstructor4 {
	
int result;
public static void main(String[] args) {
	studentexampleforconstructor4 obj = new studentexampleforconstructor4("TOCE",5);
	obj.displayresult();
	
}

public studentexampleforconstructor4(){ //constructor
	System.out.println("welcome to school"); //invoked as soon as obj creaed
}

public studentexampleforconstructor4(String schoolName){ //constructor
	System.out.println("welcome to school " + schoolName); //invoked as soon as obj creaed
}

public studentexampleforconstructor4(int rank){ //constructor
	System.out.println("welcome to school and rank "+rank); //invoked as soon as obj creaed
}

public studentexampleforconstructor4(String schoolName,int ranking){ //constructor
	System.out.println("welcome to school " + schoolName +" " + ranking); //invoked as soon as obj creaed
}

public studentexampleforconstructor4(int ranking,String schoolName){ //constructor
	System.out.println("welcome to school " + ranking+ " " +schoolName ); //invoked as soon as obj creaed
}

public void displayresult() { // method
	System.out.println("final Marks are "+ result);
}

}

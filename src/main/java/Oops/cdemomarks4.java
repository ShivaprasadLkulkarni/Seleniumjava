package Oops;

public class cdemomarks4 {
int result;

public static void main(String[] args) {
	cdemomarks4 obj = new cdemomarks4(91);
	obj.displaymethod();
}
public cdemomarks4(int marks) {
result=marks;//marks is assigned into result instance variable then it is called in desiplaymethod
}

public void displaymethod() {
	System.out.println("final marks for Student "+result);
}
}

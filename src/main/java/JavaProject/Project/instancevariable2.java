package JavaProject.Project;

public class instancevariable2 {

//	(Non Static feilds)global variable is not there instance variable is called
//  Instance variable are the variable which are declared in class but outside method ,constructor and block
//  If you dont provide any values then java will assign default values for them
	
	int rollno;
	double marks; //instance variable

	
//  using constructor if only 1 member for all obj use only above data memeber 
//	if you want to change for each object then u need to use an constructor
//  Assigning values at the time of object creation
	
	public instancevariable2(int rollno,double marks) { // constructors doenot have any type even void 
		this.rollno=rollno;
		this.marks=marks;
	}
	
	public static void main(String[] args) {
		instancevariable2 newobj1 = new instancevariable2(1,90.5);
		newobj1.show();
		instancevariable2 newobj2 = new instancevariable2(2,94.44);
		newobj2.show();
		instancevariable2 newobj3 = new instancevariable2(3,83.3);
		newobj3.show();
		
// for non static Each instances if you create 10 objects also gets
// 10 own copies of datatmember or instance variiable it is set like that
// higher preferences given to local variables 
// if you have certain variables which u want to access through out diff methods go for instances variables

		}
	
	public void show() {
	
		System.out.println("Rollnymb : " + rollno + ","+"and marks are   "+marks );
	}
}

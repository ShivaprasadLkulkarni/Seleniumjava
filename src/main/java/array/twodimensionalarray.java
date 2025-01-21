package array;

public class twodimensionalarray {
public static void main(String[] args) {
	
	
	String student_name[]= new String[9];
	student_name[0]="Shiva";
	student_name[1]="Shiva Prasad";
	student_name[2]="ShivaPrasad L Kulkarni";
	student_name[3]="SE 1";
	student_name[4]="Software Test Analyst | SDET";
	
	int sizeofarray=student_name.length;
	System.out.println("Size of an array :  " + sizeofarray );
	
	for(int i=0;i<sizeofarray;i++){
		
		System.out.println("students name : "+student_name[i]);
	}
}
}

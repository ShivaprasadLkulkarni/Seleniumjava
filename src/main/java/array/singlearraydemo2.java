package array;

public class singlearraydemo2 {
public static void main(String[] args) {

	int students_id[] = new int[5];
	//20byte of memeory 4*5
	
	students_id[0] =(int) 89.5;//down casting double to int
	students_id[1] =86;
	students_id[2] =84;
	students_id[3] =81;
	students_id[4] =79;
	
	int sizeofarray=students_id.length;
	System.out.println("Size of an array :  " + sizeofarray );
	
	for(int i=0;i<sizeofarray;i++){
		
		System.out.println("students id : "+students_id[i]);
	}
	
	
}
}

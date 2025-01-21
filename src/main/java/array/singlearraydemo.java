package array;

public class singlearraydemo {
	public static void main(String[] args) {
	// aray is collection of similar datattyp
//		syntax : 
//		datatype arrayname[] = new datatype[size];
		
		int students_id[] = new int[5];
		//20byte of memeory 4*5
		
		students_id[0] =(int) 89.5;//down casting double to int
		students_id[1] =86;
		students_id[2] =84;
		students_id[3] =81;
		students_id[4] =79;
		

		System.out.println("students id : "+students_id[2]);
//		System.out.println("students id : "+students_id[5]); //ArrayIndexOutOfBoundsException
	}

}

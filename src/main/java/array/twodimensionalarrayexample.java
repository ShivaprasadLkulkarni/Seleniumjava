package array;

public class twodimensionalarrayexample {
public static void main(String[] args) {
	//in selenium we use only 2d and 1d array

	int school[][]=new int[2][3];//rows and columns
	school[0][0]=11112;
	school[0][1]=11212;
	school[0][2]=112;
	school[1][0]=22221;
	school[1][1]=12112;
	school[1][2]=112;
	
	System.out.println(school[1][2]);
	int sizeofarray=school.length;
	System.out.println("Size of an array (number of rows):  " + sizeofarray );
	
	for(int i=0;i<sizeofarray;i++){
		for(int j=0;j<school[i].length;j++) {
			System.out.println("school indexes : "+school[i][j]);
		}
		
	}}
}



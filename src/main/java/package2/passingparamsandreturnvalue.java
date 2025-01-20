package package2;

public class passingparamsandreturnvalue {
public static void main(String[] args) {
	
//	  TO MAKE OUR PROGRAM DYNAMIC WE CAN PASS PARAM WHILE CALLING METHODS
//	  PARAMETER CAN BE COMPILED TIME AND RUN TIME AS WELL.
	 
      passingparamsandreturnvalue obj1 = new passingparamsandreturnvalue();
      obj1.add(112, 122);
      obj1.sub(122.1212,1212.231);
//	
//    other class object accesing in this class can also be done but 
//	  obj using classname has to be created using 
//	  dot operator access methods creating varible and edeclare data type print 
    
	howtoreturn object1 = new howtoreturn();
	int sum =object1.add(121, 11); // if u r using return and used data type need to create variable and declare the datatype
	System.out.println("Result of howtoreturn class :"+sum);
	String name = object1.addition("Shivaprasad L ", "Kulkarni");
	System.out.println("Result of howtoreturn class " + name);
  
    
}

          public  void add(int a,int b) {
	      int c=a+b;
	      System.out.println("This Class res : "+c);
	
}
          public void sub(double x,double y) {
	      double result=x-y;
	      System.out.println("This Class res : "+result);
}
}

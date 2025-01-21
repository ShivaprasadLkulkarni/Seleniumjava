package Oops;

public class overriidnganotherexampleaHDFC extends overriidnganotherexampleaRBI{

	
	public static void main(String[] args) {
		overriidnganotherexampleaHDFC h =new overriidnganotherexampleaHDFC();
	    h.homeloanIntrate();
//	    here it is an example of overriding
		overriidnganotherexampleaRBI obj1= new overriidnganotherexampleaRBI();
		obj1.homeloanIntrate();
		//to override//
//		 u have to create parent class obj and acces it
	}
	
	public void homeloanIntrate() {
		System.out.println("Home Loan Int rate is 11%");
	}
}

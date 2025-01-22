package Oops;

public class overriidnganotherexampleaSBI extends overriidnganotherexampleaRBI implements loaninterface {

	public static void main(String[] args) {
		overriidnganotherexampleaSBI home = new overriidnganotherexampleaSBI();
		home.homeloanIntrate();
		home.carloand();
		home.homeloand();
//		
	}
	
	public void homeloanIntrate() {
		System.out.println("Home Loan Int rate is 9%");
	}

	@Override
	public void homeloand() {
		
		System.out.println("SBI providing home loan");
	}

	@Override
	public void carloand() {
		// TODO Auto-generated method stub
		System.out.println("SBI providing car loan");

	}
}

package Programs;

import java.util.Scanner;

public class isprime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println(isprime(2));
//		System.out.println(isprime(5));
		int inps = sc.nextInt();
		
		if (isprime(inps)) {
			System.out.println("is prime : "+ inps);
		}else {
			System.out.println("not prime :"+inps);
			
		}
		sc.close();
	}
	
	public static boolean isprime(int inp) {
		
		if(inp ==0 || inp ==1) {
			return false;
			
		}
		if (inp==2) {
			return true;
		}
		
		for(int i=2;i<=inp/2;i++) {
			if(inp%i ==0) {
				return false;
			}
		}
		return true ;
	}

}

package Oops;
// In simple words one things in multiple form
// Add()
// Add(int a)
// Add(int a,int b)
// method name is same but arguements are getting change
// Overloading | Compile time Early binding
// OverRiding | Runtime poly LAte Binding

//signature method can be overloaded if and only if method has the same name but wit diff signature
// signature is am number of arguement
 

// Constructor Overloading is cleared
//  Overriding is pending



public class polymorphism1 {

	public static void main(String[] args) {
//	Method Overloading
		polymorphism1 obj1 = new polymorphism1();
		obj1.add(21,21);
		obj1.add(21,11,11);
		obj1.add(211.2,211.2);
		obj1.add(2,21.1);
		obj1.add(2.211,1);
		obj1.add(211,211);
		obj1.add(2111.2,2111.2);
		obj1.add("s","s");
		obj1.add("Shiv",1);
		obj1.add(1,"Shiv");
	};
	// 1) Same methods diff args
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(" 1)Res : numb is "+c);
	}
	// 2) 3 args
	public void add(int a,int b,int c) {
		int d=a+b+c;
		System.out.println(" 2) Res : numb is "+c);
	}
	
	//3) same method name 2 args type of  arg
	public void add(double a,double b) {
		double c=a+b;
		System.out.println(" 3) Res : numb is "+c);
	}
	
	// order of arguemnets are change
	public void add(int a,double b) {
		double sum=a+b; // here integr is converting into double is known as typecassting upcastign
		System.out.println(" 4) Res : numb is "+sum);
	}
	
	// order of arguemnets are change
		public void add(double a,int b) {
			double sum=a+b; // here integr is converting into double is known as typecassting upcastign
			System.out.println(" 5) Res : numb is "+sum);
		}
	//	order of arguemnets are change
		public void add(String a,int b) {
			String c=a+b;
			System.out.println(" 6)Res : numb is "+c);
		}	
//		order of arguemnets are change
			public void add(int a,String b) {
				String c=a+b;
				System.out.println(" 7)Res : numb is "+c);
			}	
//			order of arguemnets are change
				public void add(String a,String b) {
					String c=a+b;
					System.out.println(" 8)Res : numb is "+c);
				}	
}

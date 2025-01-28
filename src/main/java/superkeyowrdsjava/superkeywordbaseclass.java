package superkeyowrdsjava;

//This is one of the Reserved keyowrd in java andsuper keyword is then refernace variables
// super keyword can be used with variables,methods and constructor
//super keyword will be used when we us inheritance concept


// Scenario 1
// when parent class and child class has the same variable with same name if child class want to access the parent class variable in that case we will use super keyword
// Scenario 2
//when parent class and child class method name andif we want to call parent class method in that case we will use super keyword
//super.method()
//super.method(a,b)
// Scenario 3
// whenever we need to call base class constructor from child class we can use super()
//super()
//super(a,b)

public class superkeywordbaseclass {
    
    int int_rate=8;


public void showmeintrate(){
    System.out.println("iam in base class");;
}
}


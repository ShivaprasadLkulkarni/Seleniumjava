package keyowrdsjava;

public class parentclassconstructoreg1 {
    

    public parentclassconstructoreg1(){ // must be default constructors in both class or elese java throws errror for param constructor
        System.out.println("iam in parent class"); // java by default calls default constructor when object is created and inherited to child class even though param constructor is avaialble
    }

    public parentclassconstructoreg1(String name){
        System.out.println("iam in parent class param "+name);// by 
    }

    public parentclassconstructoreg1(String fname, String lname){
        System.out.println("iam in parent class param "+fname + " "+lname);// by 
    }
}

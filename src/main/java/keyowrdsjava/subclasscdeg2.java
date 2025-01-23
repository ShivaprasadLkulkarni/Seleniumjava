package keyowrdsjava;

public class subclasscdeg2 extends parentclassconstructoreg1 {

// construxtor
// wehn uneed to work with super it s mandatory to extend the baseclass
    public  subclasscdeg2(){
        System.out.println("iam in child class constructor");
    }
    

    public  subclasscdeg2(String name){
        super(name,"kulkarni");
   //cant create one more line using super if you wnat do doit then make one more constructor
        //wehenever u have to make call to the parent class parameterized constructor u nned to use super keyword and pass parameter
        
        System.out.println("iam in child class constructor param "+name);
    }
    
    public static void main(String[] args) {
        subclasscdeg2 obj1 = new subclasscdeg2("shiva"); 
    }
}
 
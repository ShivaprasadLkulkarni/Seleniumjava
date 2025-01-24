package finalkeyword;

public class finaldemo2 {

    final String PANCARD; // here java doesnot allows final variable to keep blank but using cosntructor it is possibel

    public finaldemo2(String pancard){
        
        PANCARD = pancard; 

    }// if you use balank final variable then u must use paramaterized constructor
    public static void main(String[] args) {
        finaldemo2 obj= new finaldemo2("mk");
        obj.show();

    }

    public void show(){
        System.out.println("this are pancard details : "+ PANCARD);
    }
}

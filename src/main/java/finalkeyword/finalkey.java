package finalkeyword;
// final keyword is one of the reserved keyword in java
// it is mainly us to restrct the user
// once variable is final u cant change the value
// by default all vaitabls in interface ins static and final

// synatx and example
//  without final
//  public int marks =90;
// public final int marks =90;
// java recommends to use CAPletters for final variables
// public final int MARKS =90;
// 
// BLanjk Final Variable
// When we dont intialize the final variable at the tim eo fdeclaration it is called final variable 
//Note it can be intialed only in construcotr
// eg: public final custI d;
//


public class finalkey {
    public static void main(String[] args) {
        finalkey fk =new finalkey();
        fk.show();
    }

    public void show(){
        int marks = 90;
        marks=91;

        final int FINAL_MARKS = 5154; //java sasys once it is initialzed u cannot change th evalue
        //FINALMARKS= 78;// NOt pososible
        System.out.println(marks);
        System.out.println(FINAL_MARKS);
    }
}

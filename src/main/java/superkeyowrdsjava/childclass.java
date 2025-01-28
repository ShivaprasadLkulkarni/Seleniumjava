package superkeyowrdsjava;

public class childclass extends superkeywordbaseclass{
    int int_rate=10;


    public static void main(String[] args) {
        childclass obj1 = new childclass();
         obj1.showmeintratefrompvtbank();
        //  obj1.showmeintrate();
        // System.out.println(obj1.int_rate);
       //System.out.println("rate : " +super.int_rate);//invalid reason is here we cant acces super keywrod in static method
    }

    public void showmeintrate(){
        System.out.println("iam in child class");
    }

    public void showmeintratefrompvtbank(){
        showmeintrate();//child class
        super.showmeintrate();  // claling frm base clas
        
        System.out.println(" Current rate : " +super.int_rate);
        System.out.println(" Current rate : " +int_rate);}
    
    
}

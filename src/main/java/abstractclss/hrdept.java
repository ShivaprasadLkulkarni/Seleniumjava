package abstractclss;

public class hrdept extends Itdep {
    public static void main(String[] args) {
      //1st scenario
        hrdept hr =new hrdept();
        hr.goodies();
        hr.work();
        hr.salary();
        hr.bonus();
        // 2 nd scenario ref of hr team obj point to base clss
        Itdep it=new hrdept();
        it.goodies();
        it.work();
        it.salary();
       // it.bonus();//can t access
       

       //obj of abstract clss it
       // interface is 100 percent abstract class
    //  Itdep it1 = new Itdep();
       // statement by java if ur class is not fully implemented then we will npot allow allow u to create an obj
    }

 public void bonus(){
    System.out.println("Bonus is 1 lakh");
 }
    public void salary() {

   System.out.println("CTC:5Laks per annum");
    }
    
}

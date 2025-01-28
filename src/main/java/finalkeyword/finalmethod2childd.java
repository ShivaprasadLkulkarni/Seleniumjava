package finalkeyword;
//   any method has final keyowrd with it will be called as final method
// we can not override the final methods.
//Note - we can inherit the final methods but can't overd
public class finalmethod2childd extends finalmethod2parent {
public static void main(String[] args) {
    
    finalmethod2childd obj = new finalmethod2childd();
    obj.name();
    obj.Adress();
    obj.phonenumb();

}    

    // public final void name(){ //cant overide in chilcd clasas
    //     System.out.println("my name is shiva");
    // } // invaklid cant be overriden


    public  void Adress(){
        super.Adress();// overriding simply old conceot practising here not included in this
        System.out.println("my city is usa");
    }

    public void phonenumb(){
        System.out.println("my numb is : 8147342654");
    }
   
}

package wrapperclasses;

import org.checkerframework.checker.units.qual.s;

public class boxingnunboxing {
    public static void main(String[] args) {
        

        int a =100;// converting from primitive to object class is 
        // AUtoboxing
        Integer b=a;

        System.out.println("Autoboxing "+b);

        //Boxing
        int x=90;

        Integer y=Integer.valueOf(x);
        System.out.println("boxing : " +y);

        //when econvert object of wrapper class obj to its respective prmitive type.
        //unboxing
        Integer result =100;
        int newRes = result.intValue();
        System.out.println("unboxing" + newRes);

        //Autoboxing
        Integer marks =78;
        int newMArks=marks;
        System.out.println("Autoboxing" + newMArks);
    }
    
}

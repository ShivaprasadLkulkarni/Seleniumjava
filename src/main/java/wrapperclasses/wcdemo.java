package wrapperclasses;
// wrapper classes are predefined class by jva which can contain primitive data type
// in simple words we can wrap a primitive value to wrapper class obj

// primitive datatype - boolean byte char float int long short double
// wrapper classes - Boolean Byte Character Integer Long Short Double

//
public class wcdemo {
    public static void main(String[] args) {
        int a =1100;
        System.out.println("primitive :"+ a);

        Integer b =100; //its refernce or an objectof integer type which contains value of 200 along refeernece of object
        System.out.println("Wrapper :"+ b);
    }

}

package wrapperclasses;

public class demo3 {
    public static void main(String[] args) {
        
    
    String price1="212.212";
        String price2="2112.122";
     System.out.println(price1+price2);

     //wrapper classes is used to conver to string to respective data type
    
     Double p1=Double.parseDouble(price1);
    Double p2 =Double.parseDouble(price2);
     System.out.println(p1);
      System.out.println(p2);
    Double sum =p1+p2;
    if(sum==700.2362){
        System.out.println("passed");
    }
    else{
        System.out.println("failed tests");
    }
    }
}
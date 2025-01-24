package wrapperclasses;

public class demo2 {
    public static void main(String[] args) {
        
        String price1="212";
        String price2="2112";
     System.out.println(price1+price2);

     //wrapper classes is used to conver to string to respective data type
    
     int p1=Integer.parseInt(price1);
    int p2 =Integer.parseInt(price2);

    int sum =p1+p2;
    if(sum==700){
        System.out.println("passed");
    }
    else{
        System.out.println("failed tests");
    }
    }
}

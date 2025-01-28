package thiskeyword;

public class myvariables {
	int x;//global variabe in blue
	int y;
	
	public myvariables(int a,int b)
//	public myvariables(int x,int y) // local variable {
	{
//		this.x=x;// this alsways refers to current class refernace variables
//		this.y=y;
//		
		x=a;
		y=b;
	}
	
	public void sum() {
		int  sum =x+y;
		System.out.println(sum);
	}
	
public static void main(String[] args) {
	myvariables obj = new myvariables(10,50);
	obj.sum();
}
}

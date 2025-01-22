package interfacedemo;


//is an special kind of class
//which contains variables and which cant be changed
//it contains the method declaration only not ht method body
//it has constants and abstracts methods only
//syntax
//interface name
//{
//Variables
//methods();
//}
public interface interfacedemocalc {
	final int x=10;// By default in interface variables will be final and variables cant be changed
	
	public void add();
	public void sub();


}
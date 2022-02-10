package interfaces;

import interfaces.interface_class.x;
import interfaces.interface_class.y;

public class interface_class {
	
	interface x
	{
		//every method in inteface is public and abstract
		//every variable in interface is public static and final
		//we cannot declare constructors in interface
		
		public void m1();
		public void m2();
	}
	interface y{
		
	//	public int m1();
	}

}
interface c extends x,y//an interface can extends multiple interfaces
{
	
}



class test_mahesh{
	

}

//a class can extend another class and implements interfaces ata time
abstract class child_to_testmahesh extends test_mahesh implements x,y
{
	

}

//a class can implements n multiple interfaces
abstract class child_one implements x,y
{
	public void m1()
	{
		System.out.println("if not provided with all method implementation then class name should be declared with abstract");
	}
	}

class  child_two extends child_one
{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("child two implementation");
		
	}
	}

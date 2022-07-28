package Polymorphism_;



public class method_overloading_child extends Method_Overriding {
	
	
	public static void main(String[] args) throws InterruptedException {

		// method_overloading_child ss=new Method_Overriding();
		 
		 Method_Overriding cg=new method_overloading_child();
		 
		// this is an error and java cannnot support this as parent can have the
		// child type but child cannot have the parent type

		method_overloading_child SS = new method_overloading_child();// this is
																		// valid
																		// as
																		// child
																		// can
																		// have
																		// parent
																		// type
		SS.sum();

	}

	public method_overloading_child sum() {// adding return types as parent
											// object to parent and child object
											// to child

		System.out.println("this is child class method");// static methods
															// cannot be
															// overrriden
															// although methods
															// are accessible
															// they are not
															// called as
															// overriden methods
		return null;

	}
}
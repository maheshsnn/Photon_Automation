package Inheritance;

public class testclass_1 extends Inheritance_sample {

	public void mm() {
		System.out.println("xy");

	}

	public void mx() {
		System.out.println("xy");

	}

	public static void main(String[] args) {
		// testclass_1 u=new testclass_1();

		Inheritance_sample sss = new testclass_1();// only parent class methods can be accessed
		sss.mm(10);
		sss.mmm();

		// testclass_1 ss= new Inheritance_sample();

		// u.mm();
	}

}

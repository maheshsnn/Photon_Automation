package GetterSetter;

public class Getter_setter {

	private String name;

	public static void main(String[] args) {

		Getter_setter s = new Getter_setter();

		s.setter("Mahesh");
		System.out.println(s.getter());

	}

	public String getter() {
		return name;
	}

	public void setter(String name) {

		this.name = name;
	}

}

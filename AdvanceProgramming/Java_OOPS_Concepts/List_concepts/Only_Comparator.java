package List_concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Only_Comparator {

	public static void main(String[] args) {

		List<Employee> l = new ArrayList<Employee>();

		l.add(new Employee("Tom", 1981));
		l.add(new Employee("Peter", 1978));
		l.add(new Employee("John", 1924));
		l.add(new Employee("Mary", 1956));
		l.add(new Employee("Daisy", 1963));
		l.add(new Employee("Peter", 1931));

		Comparator<Employee> cr = new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				// TODO Auto-generated method stub
				
				  /*if(e1.getDob()>e2.getDob()) { return 1;
				  
				  } else { return -1; } }*/
				 

				if (e1.getName().compareTo(e2.getName()) > 0) {
					return 1;

				} else {
					return -1;
				}
				
				
			}

		};

		Collections.sort(l, cr);
		//Collections.sort(l);
		System.out.println(l);

	}

}
	
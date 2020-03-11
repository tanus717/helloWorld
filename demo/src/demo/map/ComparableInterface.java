package demo.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableInterface {

	public static void main(String[] args) {

		List<Model> m = new ArrayList<>();

		Model model1 = new Model();
		model1.setName("CTS");
		model1.setEmail("TS@Gmail.com");
		m.add(model1);
		Model model2 = new Model();
		model2.setName("ATS");
		model2.setEmail("TS@Gmail.com");
		m.add(model2);
		Model model3 = new Model();
		model3.setName("ASS");
		model3.setEmail("TS@Gmail.com");
		m.add(model3);

		Collections.sort(m, new Comparator<Model>() {

			@Override
			public int compare(Model o1, Model o2) {
				System.err.println("KEys  "+o1.getName() +" "+o2.getName()+"  Value  : "+-(o1.getName().compareTo(o2.getName())));
				return -(o1.getName().compareTo(o2.getName()));
			}
		});
		m.forEach(m1 -> System.err.println(m1.getName()));
		System.err.println();
	}

}

class Model {

	private String name;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

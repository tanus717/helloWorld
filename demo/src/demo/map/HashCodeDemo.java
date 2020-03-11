
package demo.map;

import java.util.HashSet;

public class HashCodeDemo {
	public String name;

	@Override
	public int hashCode() {
		return 21;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashCodeDemo other = (HashCodeDemo) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String args[]) {
		HashCodeDemo employeeOne = new HashCodeDemo();
		HashCodeDemo employeeTwo = new HashCodeDemo();
		employeeOne.name = "John";
		employeeTwo.name = "John2";
		HashSet<HashCodeDemo> employeeSet = new HashSet<>();
		employeeSet.add(employeeOne);
		employeeSet.add(employeeTwo);

	//	System.err.println(employeeOne.equals(employeeTwo));
		System.err.println("ONE :  " + employeeOne.hashCode());
		System.err.println("TWO :  " + employeeTwo.hashCode());
		System.out.println(employeeSet.size());
		employeeSet.forEach(a -> System.err.println(a.getName()));
		System.err.println();
	}
}

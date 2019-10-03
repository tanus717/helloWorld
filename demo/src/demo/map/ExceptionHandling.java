package demo.map;

public class ExceptionHandling extends D {

	public static void main(String[] args) {
		ExceptionHandling handling1 = new ExceptionHandling();
		ExceptionHandling handling2 = new ExceptionHandling();
		ExceptionHandling handling3 = new ExceptionHandling();
		D d = new ExceptionHandling();

		System.err.println(handling1.hashCode());
		System.err.println(handling2.hashCode());
		System.err.println(handling3.hashCode());

		System.err.println(handling1.equals(d));
		System.err.println(handling3.equals(d));
		System.err.println(handling2.equals(d));

	}

	@Override
	public int hashCode() {
		return 100;
	}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}
}

class D {

}
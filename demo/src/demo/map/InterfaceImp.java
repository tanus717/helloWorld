package demo.map;


public class InterfaceImp extends Second  implements Interface2,Interface1{


	public static void main(String[] args) {
		new InterfaceImp().show();
	}

	@Override
	public void show() {
		System.err.println(" S.H.O.W. ");
	}
}
class Second implements Interface1 {
}

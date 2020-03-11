package demo.map;

public class PrimeNumberwithoutloop {

	static void PrimeNumber(double num) {
		double n = num / 6;
		System.out.println(Math.round(n));
		if (n < Math.round(n)) {
			n = 6 * (Math.round(n)) - 1;
			if (n == num)
				System.out.println("Prime");
			else
				System.out.println("Not Prime");
		} else {
			n = 6 * (Math.round(n)) + 1;
			if (n == num)
				System.out.println("Prime");
			else
				System.out.println("Not Prime");
		}

	}

	public static void main(String[] args) {

		double num = 85;
		PrimeNumber(num);

	}

}
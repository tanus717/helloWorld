package demo.map;

public class MisingNumberFindInArray {

	public static void main(String[] args) {
		int[] A = { 2, 5, 78, 99, 3 };
		find(A);

	}

	static void find(int[] A) {
		int[] B = new int[101];
		for (int i = 0; i < A.length; i++) {
			B[A[i]] = 1;
		}
		for (int i = 1; i < B.length; i++) {
			if (B[i] == 0)
				System.out.print(i + " ");
		}
	}

}

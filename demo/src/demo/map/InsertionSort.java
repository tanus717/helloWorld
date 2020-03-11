package demo.map;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = { 9, 5, 1, 4, 3 };
		for (int i : a) {
			System.out.print(" " +i);
		}
		insert(a);
		System.err.println();
	for (int i : a) {
		System.out.print(" " +i);
	}
	}

	public static int[] insert(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && key < a[j]) {
				a[j + 1] = a[j];
				--j;
			}
			a[j + 1] = key;
		}

		return a;

	}
}

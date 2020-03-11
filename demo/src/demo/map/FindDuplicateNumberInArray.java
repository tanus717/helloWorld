package demo.map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateNumberInArray {

	public static void main(String[] args) {
		int[] A = { 1, 2, 5, 4, 6, 5, 7, 2, 5, 4, 5 };
		find(A);

	}

	static void find(int[] A) {

		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			if (!list.contains(A[i])) {
				list.add(A[i]);
			} else {
				set.add(A[i]);
			}

		}
		 System.err.println("Remove Duplicate : "+list);
		 System.err.println("Duplicate : "+set);

	}
}

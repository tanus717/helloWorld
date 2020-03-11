package demo.datastructure.datastructure;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

	public static void main(String[] args) {
		int [] A = {2,11,5,7,8 ,23};
		TwoSumProblem sum = new TwoSumProblem();
		sum.result(A, 13);
	}

	public void result(int[] A,int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < A.length; i++) {
			if(!map.containsKey(target - A[i]))
			map.put(A[i], i);
			else {
				result[1] = i;
				result[0]= map.get(target - A[i]);
			}
		}
		if(result[0]==result[1])
			System.out.println("Not Found");
		else
		System.out.print("Result ["+result[0]+","+result[1]+"]");
	
	}

}

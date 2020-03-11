package demo.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethod {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(8);
		l.add(3);
		l.add(4);
		l.add(2);
		l.add(6);
		l.add(9);
		l.add(7);
		Collections.sort(l);

		System.out.println(l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()));
		System.out.println(l.stream().map(i -> i*2).collect(Collectors.toList()));
		System.out.println(l.stream().collect(Collectors.toSet()));
		
	}

}
 
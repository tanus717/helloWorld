package demo.datastructure;

import java.util.Enumeration;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class Demo {

	public static void main(String[] args) {

		Vector<Integer> h = new Vector<>();
		ConcurrentHashMap<Integer, Integer> m = new ConcurrentHashMap<Integer, Integer>();

		m.put(12, 121);
		m.put(13, 121);
		m.put(14, 121);

		m.put(15, 121);

		m.put(16, 121);
		m.put(17, 121);

		int k = 100;
		int j = 200;
		Set<Entry<Integer, Integer>> s = m.entrySet();

		for (Entry<Integer, Integer> entry : s) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
			m.put(k++, j++);
		}

		h.add(12);
		h.add(76);
		h.add(54);
		h.add(23);
		h.add(567);
		h.add(90);
		h.add(122);
		h.add(43);
		h.add(34);
		int i = 121;
		Enumeration<Integer> e = h.elements();
		while (e.hasMoreElements()) {
			Integer object = e.nextElement();
			System.out.println("OBj : " + object);
			h.add(i++);
		}

	}

}
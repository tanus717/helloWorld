/**
 * 
 */
package demo.datastructure;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheUsingLinkedHashMap<K, V> extends LinkedHashMap<K, V> {

	public static void main(String[] args) {
		LRUCacheUsingLinkedHashMap<Integer, String> lru = newInstance(4);
		lru.put(1, "O1");
		lru.put(2, "T2");
		lru.put(3, "T3");
		lru.put(4, "F4");
		lru.put(5, "F5");
          lru.get(3);

		for (Map.Entry<Integer, String> l : lru.entrySet()) {
			System.out.println(l.getValue());
		}

	}

	private static final long serialVersionUID = 1L;
	private int size;

	private LRUCacheUsingLinkedHashMap(int size) {
		super(size, 0.75f, false);
		this.size = size;
	}

	public static <K, V> LRUCacheUsingLinkedHashMap<K, V> newInstance(int size) {
		return new LRUCacheUsingLinkedHashMap<K, V>(size);
	}

	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		return size() > size;
	}


	@Override
	public V get(Object key) {

		return super.get(key);
	}
	
	
}
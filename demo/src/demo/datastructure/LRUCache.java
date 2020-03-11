package demo.datastructure;

import java.util.HashMap;
import java.util.Map;

public class LRUCache<K, V> {

	private Node<K, V> lru;
	private Node<K, V> mru;
	private int capacity;
	private int currentSize;
	private Map<K, Node<K, V>> container;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.currentSize = 0;
		lru = new Node<K, V>(null, null, null, null);
		mru = lru;
		container = new HashMap<K, Node<K, V>>();
	}

	public V get(K key) {
		if (!container.containsKey(key))
			return null;
		Node<K, V> newNode = container.get(key);
		if (newNode.key == mru.key)
			return mru.value;

		/**
		 * Get Next/Prev node
		 */
		Node<K, V> nextNode = newNode.next;
		Node<K, V> prevNode = newNode.prev;

		if (newNode.key == lru.key) {
			newNode.prev = null;
			lru = newNode;
		}

		/**
		 * Remove middle node for insert into MRU
		 */

		else if (newNode.key != mru.key) {
			prevNode.next = nextNode;
			nextNode.prev = prevNode;
		}
		/**
		 * Swap MRU to newNode
		 */

		newNode.prev = mru;
		mru.next = newNode;
		mru = newNode;
		mru.next = null;

		return newNode.value;
	}

	public void put(K key, V value) {
		if (container.containsKey(key))
			return;

		/**
		 * insert new value
		 */
		Node<K, V> newNode = new Node<K, V>(mru, null, key, value);
		mru.next = newNode;
		container.put(key, newNode);
		mru = newNode;

		if (capacity == currentSize) {
			container.remove(key);
			lru = lru.next;
			lru.prev = null;
		}

		if (capacity > currentSize) {

			currentSize++;
		}
	}
}

class Node<K, V> {

	Node<K, V> prev;
	Node<K, V> next;
	K key;
	V value;

	public Node(Node<K, V> prev, Node<K, V> next, K key, V value) {
		this.prev = prev;
		this.next = next;
		this.key = key;
		this.value = value;
	}
}
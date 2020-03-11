package demo.datastructure.linkedlist;

public class LinkedListDemo {

	Node head;

	public void insertAtBegin(int data) {
		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else {
			Node n = head;
			while (n.next != null)
				n = n.next;

			n.next = newNode;
		}
	}

	public void insertAt(int index, int data) {
		Node newNode = new Node(data);
		if (index < size()) {
			if (size() == 0)
				head = newNode;
			else {
				Node n = head;
				for (int i = 0; i < index - 1; i++) {
					n = n.next;
				}
				newNode.next = n.next;
				n.next = newNode;
			}
		} else {
			System.err.println("Index Out Of Bound Error.");
		}
	}

	public void deleteAtBegin() {
		if (isEmpty())
			System.out.println("List Already Empty.");
		else {
			head = head.next;
		}
	}

	public void show() {

		if (isEmpty())
			System.out.println("Linked List Empty.");
		else {
			Node n = head;
			while (n != null) {
				System.out.print(n.data + "--> ");
				n = n.next;
			}
			System.out.print("NULL");
		}
	}

	public boolean isEmpty() {
		if (head == null)
			return true;
		return false;
	}

	int size() {
		Node n = head;
		int size = 0;
		while (n != null) {
			size++;
			n = n.next;
		}
		return size;
	}

	public void reverseLinkedList() {

		Node next = null;
		Node previous = null;
		Node current = head;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;

	}

	public void findNthNodeAtEnd(int position) {

		Node ref = head;
		Node main = head;
		int count = 0;
		if (size() < position) {
			System.out.println("Invalid Position. the Size of List is : " + size());
			return;
		}
		while (count < position) {
			ref = ref.next;
			count++;
		}
		while (ref != null) {
			ref = ref.next;
			main = main.next;
		}
		System.out.println(position + "th Node at the End of List is  : " + main.data);
	}

	public void removeDuplicateInSortedList() {

		Node cuurent = head;

		while (cuurent != null && cuurent.next != null) {
			if (cuurent.data == cuurent.next.data)
				cuurent.next = cuurent.next.next;
			else
				cuurent = cuurent.next;
		}
	}

	public void insertNodeInSortedList(int data) {

		Node newNode = new Node(data);
		Node current = head;

		if (current.data > data) {
			newNode.next = head;
			head = newNode;
		} else {
			while (current.next != null) {
				if (current.data <= data && current.next.data >= data)
					break;
				else
					current = current.next;
			}
			Node temp = current.next;
			current.next = newNode;
			newNode.next = temp;
		}
	}
}

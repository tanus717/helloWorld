/**
 * 
 */
package demo.datastructure.doublylinkedlist;

public class DoublyLinkedList {

	Node head;
	Node tail;
	int length;

	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			tail.next = newNode;
		}

		newNode.previous = tail;
		tail = newNode;
		length++;
	}

	public void showBackword() {
		if (tail == null)
			System.out.println("List is Empty.");
		else {
			Node n = tail;
			while (n != null) {
				System.out.print(n.data + " --> ");
				n = n.previous;
			}
			System.out.println("NULL");

		}

	}

	public void showForword() {
		if (head == null)
			System.out.println("List is Empty.");
		else {
			Node n = head;
			while (n != null) {
				System.out.print(n.data + " --> ");
				n = n.next;
			}
			System.out.println("NULL");
		}
	}

	public void insertAtBegin(int data) {
		Node newNode = new Node(data);
		if (head == null)
			tail = newNode;
		else {
			head.previous = newNode;

		}
		newNode.next = head;
		head = newNode;
		length++;
	}

}

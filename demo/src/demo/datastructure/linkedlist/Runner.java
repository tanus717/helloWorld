package demo.datastructure.linkedlist;

public class Runner {

	public static void main(String[] args) {

		LinkedListDemo link = new LinkedListDemo();

		link.insertAtBegin(15);
		link.insertAtBegin(12);
		link.insertAtBegin(12);
		link.insertAtBegin(12);
		link.insertAtBegin(10);

		link.insertAtEnd(15);
		link.insertAtEnd(15);
		link.insertAtEnd(20);

		// link.insertAt(4, 16);

		link.show();
//		link.reverseLinkedList();
		System.out.println();
		link.show();
		System.out.println();
		link.findNthNodeAtEnd(9);

//		link.removeDuplicateInSortedList();
		link.insertNodeInSortedList(22);
		System.out.println();
		link.show();
	}

}

/**
 * 
 */
package demo.datastructure.doublylinkedlist;

public class Runner {

	public static void main(String[] args) {

		DoublyLinkedList d = new DoublyLinkedList();

	
		d.insertAtBegin(11);
		d.showForword();
		d.showBackword();
		d.insert(12);
		d.insert(13);
		d.insert(14);
		d.insert(15);
		d.insert(16);
		d.showForword();
		d.showBackword();
	}

}

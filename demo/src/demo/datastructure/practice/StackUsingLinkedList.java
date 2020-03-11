package demo.datastructure.practice;

public class StackUsingLinkedList {
	StackNode root;

	static class StackNode {
		int data;
		StackNode next;

		public StackNode(int data) {
			this.data = data;

		}
	}

	public static void main(String[] args) {
		StackUsingLinkedList demo = new StackUsingLinkedList();
		demo.push(10);
		demo.push(20);
		demo.push(30);
		demo.push(40);
		demo.push(50);
		demo.peek();
		demo.pop();
		demo.show();
	}

	void show() {
		StackNode n = root;

		while (n.next != null) {
			System.out.print("Stack  : " + n.data + " ");
			n = n.next;
		}
	}

	public void push(int data) {

		StackNode newNode = new StackNode(data);
		if (root == null) {
			root = newNode;
		} else {
			StackNode temp = root;
			root = newNode;
			newNode.next = temp;
		}
		System.out.println(data + " PUSHED TO STACK");
	}

	public boolean isEmpty() {
		if (root == null)
			return true;
		else
			return false;
	}

	public int peek() {
		if (root == null) {
			System.out.println("STACK IS EMPTY");
			return Integer.MIN_VALUE;
		} else {
			System.out.println(root.data + " PEEK TO STACK");
			return root.data;
		}

	}

	public int pop() {
		int popped = Integer.MIN_VALUE;
		if (root == null) {
			System.out.println("STACK IS EMPTY");
		} else {
			popped = root.data;
			root = root.next;
			System.out.println(popped + " POP TO STACK");
		}
		return popped;
	}

}

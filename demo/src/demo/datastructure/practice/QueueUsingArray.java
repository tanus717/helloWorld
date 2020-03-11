
package demo.datastructure.practice;

public class QueueUsingArray {

	int front;
	int rear;
	int[] A;
	int capacity;
	int currentSIze = 0;

	public QueueUsingArray(int capacity) {
		this.front = 0;
		this.rear = 0;
		A = new int[capacity];
		this.capacity = capacity;
	}

	public static void main(String[] args) {

		QueueUsingArray array = new QueueUsingArray(5);
		array.enqueue(12);
		array.enqueue(13);
		array.enqueue(14);
		array.enqueue(15);
		array.enqueue(16);
		array.dequeue();
		array.dequeue();
		array.dequeue();
		array.enqueue(56);
		array.enqueue(65);
		array.dequeue();
		array.dequeue();
		array.dequeue();
		array.dequeue();
		array.dequeue();
		array.dequeue();
		array.enqueue(12);
		array.enqueue(13);
		array.enqueue(14);
		array.enqueue(15);
		array.enqueue(16);
		array.enqueue(12);
		array.enqueue(13);
		array.enqueue(14);
		array.enqueue(15);
		array.enqueue(16);
		array.show();
	}

	public void enqueue(int data) {
		if (isFull()) {
			System.err.println("Queue already Full.");
			return;
		} else {
			A[rear] = data;
			rear = (rear + 1) % capacity;
			currentSIze++;
		}
	}

	public void dequeue() {
		if (isEmpty()) {
			System.err.println("Queue Empty.");
		} else {
			System.out.println(A[front] + " removed from the queue");
			front = (front + 1) % capacity;
			currentSIze--;
		}
	}

	public boolean isEmpty() {
		if (currentSIze == 0)
			return true;
		return false;
	}

	public boolean isFull() {
		if (capacity == currentSIze)
			return true;
		return false;
	}

	public void show() {
		System.out.println();
		for (int i = 0; i < currentSIze; i++) {
			System.err.print(A[(front + i) % capacity] + " ");
		}
	}
}

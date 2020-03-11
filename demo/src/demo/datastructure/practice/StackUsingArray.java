package 
demo.datastructure.practice;

public class StackUsingArray {
	int MAX =100;
	int[] root = new int[MAX];
	int top =-1;
	public static void main(String[] args) {
		StackUsingArray array =  new StackUsingArray();
		array.push(10);
		array.push(20);
		array.push(30);
		System.out.println("PEEK : "+array.peek());
		
	}

	public void push(int data) {
		if(top>=MAX) {
			System.err.println("Stack Overflow");
		}else {
			root[++top] = data;
			System.out.println("PUSH TO STACK");
		}
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	public int peek() {
		if(isEmpty())
			return Integer.MIN_VALUE;
		else {
			return root[top];
		}
	}

	public int pop() {
		if(isEmpty())
			return Integer.MIN_VALUE;
		else {
			return root[top--];
		}
	}

}

package stackExample02;

public class LinkedStack {
	private StackNode top;
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void push(int item) {
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("스택이 비었습니다");
			return 0;
		} else {
			int data = top.data;
			top = top.link;
			return data;
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("스택이 비었습니다");
			return 0;
		}
		return top.data;
	}
}

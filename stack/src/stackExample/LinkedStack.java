package stackExample;

public class LinkedStack {
	private StackNode top;
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void push(char item) {
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("스택이 비었습니다");
			return 0;
		} else {
			char item = top.data;
			top = top.link;
			return item;
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("스택이 비었습니다");
			return 0;
		} else {
			return top.data;
		}
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("스택이 비었습니다");
		} else {
			StackNode temp = top;
			while(temp != null) {
				System.out.println(temp.data + " ");
				top = top.link;
			}
		}
	}
}

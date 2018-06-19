package graphTraversal.stackDFS;

public class LinkedStack {
	private StackNode top;
	
	public LinkedStack() {
		this.top = null;
	}
	
	public boolean isEmpty() {
		return (this.top == null);
	}
	
	public void push(int item) {
		StackNode sNode = new StackNode(item);
		sNode.link = top;
		top = sNode;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("삭제 실패. 스택이 비었습니다.");
			return 0;
		} else {
			int item = top.data;
			top = top.link;
			return item;
		}
	}
}

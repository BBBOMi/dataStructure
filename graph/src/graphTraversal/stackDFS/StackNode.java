package graphTraversal.stackDFS;

public class StackNode {
	int data;
	StackNode link;
	
	public StackNode() {
		this.link = null;
	}
	
	public StackNode(int data) {
		this();
		this.data = data;
	}
}

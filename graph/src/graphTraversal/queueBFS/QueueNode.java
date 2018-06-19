package graphTraversal.queueBFS;

public class QueueNode {
	int data;
	QueueNode link;
	
	public QueueNode() {
		this.link = null;
	}
	
	public QueueNode(int data) {
		this();
		this.data = data;
	}
}

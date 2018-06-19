package graphTraversal.queueBFS;

public class LinkedQueue {
	private QueueNode front;
	private QueueNode rear;
	
	public LinkedQueue() {
		this.front = null;
		this.rear = null;
	}
	
	public boolean isEmpty() {
		return (front == null);
	}
	
	public void enQueue(int item) {
		QueueNode qNode = new QueueNode(item);
		if(isEmpty()) {
			front = qNode;
			rear = qNode;
		} else {
			rear.link = qNode;
			rear = qNode;
		}
	}
	
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("삭제 실패. 큐가 비었습니다.");
			return 0;
		} else {
			int item = front.data;
			front = front.link;
			if(front == null) {
				rear = null;
			}
			return item;
		}
	}
}

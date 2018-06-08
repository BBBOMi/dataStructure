package circularQueue;

public class CircularQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int queueSize = 4;
		char deletedItem;
		CircularQueue cQ = new CircularQueue(queueSize);
		
		cQ.enQueue('A');
		cQ.printQueue();
		
		cQ.enQueue('B');
		cQ.printQueue();
		
		deletedItem = cQ.deQueue();
		if(deletedItem != 0)
			System.out.println("삭제된 아이템: " + deletedItem);
		cQ.printQueue();
		
		cQ.enQueue('C');
		cQ.printQueue();
		
		cQ.enQueue('D');
		cQ.printQueue();
		
		cQ.enQueue('E');
		cQ.printQueue();
	}

}

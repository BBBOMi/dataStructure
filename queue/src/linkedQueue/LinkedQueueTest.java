package linkedQueue;

public class LinkedQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char deletedItem;
		LinkedQueue lQ = new LinkedQueue();
		
		lQ.enQueue('A');
		lQ.printQueue();
		
		lQ.enQueue('B');
		lQ.printQueue();
		
		deletedItem = lQ.deQueue();
		if(deletedItem != 0)
			System.out.println("삭제된 아이템: " + deletedItem);
		lQ.printQueue();
		
		lQ.enQueue('C');
		lQ.printQueue();
		
		deletedItem = lQ.deQueue();
		if(deletedItem != 0)
			System.out.println("삭제된 아이템: " + deletedItem);
		lQ.printQueue();
		
		deletedItem = lQ.deQueue();
		if(deletedItem != 0)
			System.out.println("삭제된 아이템: " + deletedItem);
		lQ.printQueue();
		
		deletedItem = lQ.deQueue();
		if(deletedItem != 0)
			System.out.println("삭제된 아이템: " + deletedItem);
		lQ.printQueue();

	}

}

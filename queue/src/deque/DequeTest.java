package deque;

public class DequeTest {

	public static void main(String[] args) {
		char deletedItem;
		DQueue DQ = new DQueue();
		
		DQ.insertFront('A');
		DQ.printDQueue();
		
		DQ.insertFront('B');
		DQ.printDQueue();
		
		DQ.insertRear('C');
		DQ.printDQueue();
		
		deletedItem = DQ.deleteFront();
		if(deletedItem != 0) {
			System.out.println("삭제된 아이템: " + deletedItem);
		}
		DQ.printDQueue();
		
		deletedItem = DQ.deleteRear();
		if(deletedItem != 0) {
			System.out.println("삭제된 아이템: " + deletedItem);
		}
		DQ.printDQueue();
		
		DQ.insertRear('D');
		DQ.printDQueue();
		
		DQ.insertFront('E');
		DQ.printDQueue();
		
		DQ.insertFront('F');
		DQ.printDQueue();
	}

}

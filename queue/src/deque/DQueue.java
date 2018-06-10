package deque;

public class DQueue {
	private DQNode front;
	private DQNode rear;
	
	public DQueue() {
		this.front = null;
		this.rear = null;
	}
	
	public boolean isEmpty() {
		return (front == null);
	}
	
	public void insertFront(char item) {
		DQNode newNode = new DQNode(item);
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			front.left = newNode;
			newNode.left = null;
			newNode.right = front;
			front = newNode;		
		}
		
		System.out.println(item + " 첫번째 인덱스에 삽입 성공.");
	}
	
	public void insertRear(char item) {
		DQNode newNode = new DQNode(item);
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			rear.right = newNode;
			newNode.left = rear;
			newNode.right = null;
			rear = newNode;
		}
		
		System.out.println(item + " 마지막 인덱스에 삽입 성공.");
	}
	
	public char deleteFront() {
		if(isEmpty()) {
			System.out.println("삭제 실패. 덱이 비었습니다.");
			return 0;
		} else {
			char data = front.data;
			if(front.right == null) {
				front = null;
				rear = null;
			} else {
				front = front.right;
				front.left = null;
			}
			
			return data;
		}
	}
	
	public char deleteRear() {
		if(isEmpty()) {
			System.out.println("삭제 실패. 덱이 비었습니다.");
			return 0;
		} else {
			char data = rear.data;
			if(rear.left == null) {
				front = null;
				rear = null;
			} else {
				rear = rear.left;
				rear.right = null;
			}
			
			return data;
		}
	}
	
	public void removeFront() {
		if(isEmpty()) {
			System.out.println("삭제 실패. 덱이 비었습니다.");
		} else {
			if(front.right == null) {
				front = null;
				rear = null;
			} else {
				front = front.right;
				front.left = null;
			}
		}
	}
	
	public void removeRear() {
		if(isEmpty()) {
			System.out.println("삭제 실패. 덱이 비었습니다.");
		} else {
			if(rear.left == null) {
				front = null;
				rear = null;
			} else {
				rear = rear.left;
				rear.right = null;
			}
		}	
	}
	
	public char peekFront() {
		if(isEmpty()) {
			System.out.println("덱이 비었습니다.");
			return 0;
		} else {
			return front.data;
		}
	}
	
	public char peekRear() {
		if(isEmpty()) {
			System.out.println("덱이 비었습니다.");
			return 0;
		} else {
			return rear.data;
		}
	}
	
	public void printDQueue() {
		if(isEmpty()) {
			System.out.println("덱이 비었습니다.");
		} else {
			DQNode temp = front;
			while(temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.right;
			}
			System.out.println();
			System.out.println();
		}
	}
}

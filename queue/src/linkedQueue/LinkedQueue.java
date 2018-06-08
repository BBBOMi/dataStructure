package linkedQueue;

import queue.Queue;

public class LinkedQueue implements Queue{
	QNode front;
	QNode rear;
	
	public LinkedQueue() {
		this.front = null;
		this.rear = null;
	}
	
	public boolean isEmpty() {
		return(front == null);
	}
	
	public void enQueue(char item) {
		QNode newNode = new QNode(item);
		
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			rear.link = newNode;
			rear = newNode;
		}
		
		System.out.println(item + " 삽입 성공.");
	}
	
	public char deQueue() {
		if(isEmpty()) {
			System.out.println("삭제 실패. 큐가 비었습니다.");
			return 0;
		} else {
			char data = front.data;
			front = front.link;
			if(front == null)
				rear = null;
			return data;
		}
	}
	
	public void delete() {
		if(isEmpty())
			System.out.println("삭제 실패. 큐가 비었습니다.");
		else {
			front = front.link;
			if(front == null)
				rear = null;
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("큐가 비었습니다.");
			return 0;
		} else 
			return front.data;
	}
	
	public void printQueue() {
		if(isEmpty()) {
			System.out.println("큐가 비었습니다.");
		} else {
			QNode temp = front;
			while(temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.link;
			}
			System.out.println();
		}
		System.out.println();
	}

}

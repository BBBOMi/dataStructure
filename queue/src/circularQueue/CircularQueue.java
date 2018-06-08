package circularQueue;

import queue.Queue;

public class CircularQueue implements Queue {
	private int front;
	private int rear;
	private int queueSize;
	private char[] itemArray;
	
	public CircularQueue(int queueSize) {
		this.front = 0;
		this.rear = 0;
		this.queueSize = queueSize;
		this.itemArray = new char[queueSize];
	}
	
	public boolean isEmpty() {
		return (front == rear);
	}
	
	public boolean isFull() {
		return ((rear + 1) == front) ;
	}
	
	public void enQueue(char item) {
		if(isFull()) {
			System.out.println(item + " 삽입 실패. 큐가 가득찼습니다.");
		} else {
			rear = ++rear % this.queueSize;
			itemArray[rear] = item;
			System.out.println(item + " 삽입 성공");
		}
	}
	
	public char deQueue() {
		if(isEmpty()) {
			System.out.println("삭제 실패. 큐가 비었습니다.");
			return 0;
		} else {
			front = ++front % this.queueSize;
			return itemArray[front];
		}
	}

	public void delete() {
		if(isEmpty()) {
			System.out.println("삭제 실패. 큐가 비었습니다.");
		} else {
			front = ++front % this.queueSize;
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("큐가 비었습니다.");
			return 0;
		} else {
			return itemArray[(front+1) % this.queueSize];
		}
	}
	
	public void printQueue() {
		if(isEmpty()) {
			System.out.println("큐가 비었습니다.");
		} else {
			for(int i=(front+1)%this.queueSize; i!=(rear+1)%this.queueSize; i = ++i % this.queueSize) {
				System.out.print(itemArray[i] + " ");
			}
			System.out.println();
			System.out.println();
		}
	}
	
}

package arrayqueue;

import queue.Queue;

public class ArrayQueue implements Queue {
	private int front;
	private int rear;
	private int queueSize;
	private char[] itemArray;
	
	public ArrayQueue(int queueSize) {
		this.front = -1;
		this.rear = -1;
		this.queueSize = queueSize;
		itemArray = new char[queueSize];
	}
	
	public boolean isEmpty() {
		return(front == rear);
	}
	
	public boolean isFull() {
		return (rear == this.queueSize-1);
	}
	
	public void enQueue(char item) {
		if(isFull()) {
			System.out.println("큐가 가득 찼습니다");
		} else {
			itemArray[++rear] = item;
			System.out.println(item + " 삽입 성공 ");
		}
	}
	
	public char deQueue() {
		if(isEmpty()) {
			System.out.println("삭제 실패. 큐가 비었습니다");
			return 0;
		} else {
			return itemArray[++front];
		}
	}
	
	public void delete() {
		if(isEmpty()) {
			System.out.println("삭제 실패. 큐가 비었습니다");
		} else {
			front++;
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("큐가 비었습니다");
			return 0;
		} else
			return itemArray[front+1];
	}
	
	public void printQueue() {
		if(isEmpty()) {
			System.out.println("큐가 비었습니다");
		} else {
			for(int i=front+1; i<=rear; i++) {
				System.out.print(itemArray[i] + " ");
			}
			System.out.println();
		}
	}
}

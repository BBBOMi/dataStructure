package arrayStack;

public class ArrayStack {
	private int top;
	private int stackSize;
	private char[] itemArray;
	
	public ArrayStack(int stackSize) {
		top = -1;
		this.stackSize = stackSize;
		itemArray = new char[this.stackSize];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == this.stackSize-1);
	}
	
	public void push(char item) {
		if(isFull()) {
			System.out.println("스택이 가득 찼습니다");
		} else {
			itemArray[++top] = item;
			System.out.println("삽입에 성공하였습니다");
		}
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("스택이 비었습니다");
			return 0;
		} else {
			return itemArray[top--];
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("스택이 비었습니다");
			return 0;
		} else {
			return itemArray[top];
		}
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("스택이 비었습니다");
		} else {
			for(int i=top; i>=0; i--) {
				System.out.print(itemArray[i] + " ");
			}
			System.out.println();
		}
	}
}

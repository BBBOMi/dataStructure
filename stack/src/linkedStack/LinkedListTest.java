package linkedStack;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedStack stack = new LinkedStack();
		
		stack.push('A');
		stack.printStack();
		
		stack.push('B');
		stack.printStack();
		
		stack.push('C');
		stack.printStack();
		
		System.out.println("삭제 예정 아이템 : " + stack.peek());
		
		stack.pop();
		System.out.println("삭제하였습니다");
		stack.printStack();

	}

}

package circularLinkedList;

public class CircularLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCircularLinkedList list = new MyCircularLinkedList();
		
		System.out.println("공백리스트에 원소 3개 삽입하기");
		list.insertFirst("월");
		list.insertFirst("수");
		list.insertFirst("토");
		list.printList();
		
		System.out.println("수 다음에 금 삽입");
		list.insertMiddle("수", "금");
		list.printList();
		
		System.out.println("리스트의 맨 앞에 일 삽입");
		list.insertFirst("일");
		list.printList();
		
		System.out.println("수 삭제");
		list.deleteMiddle("수");
		list.printList();
		
		System.out.println("리스트의 마지막 노드 삭제");
		list.deleteLast();
		list.printList();
	}

}

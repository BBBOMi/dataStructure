package linkedList;

public class MyLinkedListTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list = new MyLinkedList();
		
		System.out.println("공백리스트에 원소 3개 삽입");
		list.insertLast("화");
		list.insertLast("수");
		list.insertLast("금");
		list.printList();
		
		System.out.println("리스트의 맨 앞에 월 삽입");
		list.insertFirst("월");
		list.printList();
		
		System.out.println("수 다음에 목 삽입");
		list.insertMiddle("수", "목");
		list.printList();
		
		System.out.println("리스트의 마지막 원소 삭제");
		list.deleteLast();
		list.printList();
		
		System.out.println("리스트를 역순으로 바꾸기");
		list.reverseList();
		list.printList();

	}

}

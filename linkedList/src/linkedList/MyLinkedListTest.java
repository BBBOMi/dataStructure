package linkedList;

public class MyLinkedListTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list = new MyLinkedList();
		
		System.out.println("���鸮��Ʈ�� ���� 3�� ����");
		list.insertLast("ȭ");
		list.insertLast("��");
		list.insertLast("��");
		list.printList();
		
		System.out.println("����Ʈ�� �� �տ� �� ����");
		list.insertFirst("��");
		list.printList();
		
		System.out.println("�� ������ �� ����");
		list.insertMiddle("��", "��");
		list.printList();
		
		System.out.println("����Ʈ�� ������ ���� ����");
		list.deleteLast();
		list.printList();
		
		System.out.println("����Ʈ�� �������� �ٲٱ�");
		list.reverseList();
		list.printList();

	}

}

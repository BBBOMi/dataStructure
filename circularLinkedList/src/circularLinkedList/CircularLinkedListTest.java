package circularLinkedList;

public class CircularLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCircularLinkedList list = new MyCircularLinkedList();
		
		System.out.println("���鸮��Ʈ�� ���� 3�� �����ϱ�");
		list.insertFirst("��");
		list.insertFirst("��");
		list.insertFirst("��");
		list.printList();
		
		System.out.println("�� ������ �� ����");
		list.insertMiddle("��", "��");
		list.printList();
		
		System.out.println("����Ʈ�� �� �տ� �� ����");
		list.insertFirst("��");
		list.printList();
		
		System.out.println("�� ����");
		list.deleteMiddle("��");
		list.printList();
		
		System.out.println("����Ʈ�� ������ ��� ����");
		list.deleteLast();
		list.printList();
	}

}

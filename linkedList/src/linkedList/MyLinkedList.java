package linkedList;

public class MyLinkedList {
	private Node head;
	
	public MyLinkedList() {
		head = null;
	}
	
	// ����Ʈ�� �������� data ����
	public void insertLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		} else {
			Node pre = head;
			while(pre.link != null) {
				pre = pre.link;
			}
			pre.link = newNode;
		}	
	}
	
	// ����Ʈ�� �� �տ� data�� ����
	public void insertFirst(String data) {
		Node newNode = new Node(data);
		if(head == null)
			head = newNode;
		else {
			newNode.link = head;
			head = newNode;
		}
	}
	
	// preData ������ data�� ����
	public void insertMiddle(String preData, String data) {
		Node temp = searchNode(preData);
		if(temp == null) { 
			System.out.println(preData + "�� ã�� �� �����ϴ�.");
		} else {
			Node newNode = new Node(data);
			newNode.link = temp.link;
			temp.link = newNode;
		}
	}
	
	// ����Ʈ�� ������ ���Ҹ� ����
	public void deleteLast() {
		Node pre;
		Node temp;
		if(head == null) return;
		if(head.link == null)
			head = null;
		
		else {
			pre = head;
			temp = pre.link;
			while(temp.link != null) {
				pre = temp;
				temp = temp.link;
			}
			pre.link = null;
		}
	}
	
	// ����Ʈ�� �������� ����
	public void reverseList() {
		Node next = head;
		Node current = null;
		Node pre = null;
		
		while(next != null) {
			pre = current;
			current = next;
			next = next.link;
			current.link = pre;
		}
		head = current;
	}
	
	// ����Ʈ ���ҵ��� ��� ���
	public void printList() {
		Node temp = head;
		System.out.print("L = (");
		
		while(temp != null) {
			System.out.print(temp.data);
			temp = temp.link;
			if(temp != null)
				System.out.print(", ");
		}
		System.out.println(")");
	}
	
	// ����Ʈ���� data�� ����� ��带 Ž��
	// MyLinkedList Ŭ���� ���ο��� �ٸ� �޼ҵ��� ���� ������ �ϴ� �޼ҵ� -> private
	private Node searchNode(String data) {
		Node temp = head;
		while(temp != null) {
			if(data.equals(temp.data))
				return temp;
			else temp = temp.link;
		}
		return temp;
	}
}

package circularLinkedList;

public class MyCircularLinkedList {
	private Node head;
	
	public MyCircularLinkedList() {
		head = null;
	}
	
	// ������ ��� ����
	public void insertLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		} else {
			Node pre = head;
			if(pre.link == null) {
				newNode.link = head;
				head.link = newNode;
			} else {
				while(pre.link != head) {
					pre = pre.link;
				}
				newNode.link = pre.link;
				pre.link = newNode;
			}
		}
		System.out.println(data);
	}
	
	// ù��° ��� ����
	public void insertFirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		} else if(head.link == null) {
			head.link = newNode;
			newNode.link = head;
		} else {
			Node last = head;
			while(last.link != head) {
				last = last.link;
			}
			last.link = newNode;
			newNode.link = head;
		}
	}
	// �߰� ��� ����
	public void insertMiddle(String searchData, String data) {
		Node temp = searchNode(searchData);
		if(temp == null) System.out.println(searchData + "�� ã�� �� �����ϴ�.");
		else {
			Node newNode = new Node(data);
			newNode.link = temp.link;
			temp.link = newNode;
		}
	}
	
	// ������ ��� ����
	public void deleteLast() {
		Node pre = head;
		Node temp = pre.link;
		while(temp.link != head) {
			pre = temp;
			temp = temp.link;
		}
		pre.link = head;
	}
	
	// ù��° ��� ����
	public void deleteFirst() {
		//Node pre;
		Node temp = head;
		while(temp.link != head) {
			temp = temp.link;
		}
		temp.link = head.link;
	}
	
	// �߰� ��� ����
	public void deleteMiddle(String searchData) {
		Node temp = searchNode(searchData);
		if(temp == null) System.out.println(searchData + "�� ã�� �� �����ϴ�.");
		else {
			Node pre = head;
			while(pre.link != temp) {
				pre = pre.link;
			}
			pre.link = temp.link;
		}
	}
	
	// ��� �˻�
	private Node searchNode(String data) {
		Node temp = head;
		while(temp != head) {
			if(data.equals(temp.link)) return temp;
			else temp = temp.link;
		}
		return null;
	}
	
	// ����Ʈ ����Ʈ
	public void printList() {
		System.out.print("L = (");
		Node temp = head;
		while(temp != head) {
			System.out.println(temp.data);
			temp = temp.link;
			if(temp != head) System.out.print(", ");
		}
		System.out.println(")");
	}
}

package circularLinkedList;

public class MyCircularLinkedList {
	private Node head;
	
	public MyCircularLinkedList() {
		head = null;
	}
	
	/*// ������ ��� ����
	public void insertLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			//newNode.link = newNode;
		} else {
			Node pre = head;
			if(pre.link == null) {
				pre.link = newNode;
				newNode.link = pre;
			} else {
				while(pre.link != head) {
					pre = pre.link;
				}
				newNode.link = pre.link;
				pre.link = newNode;
			}
		}
	}*/ // circularLinkedList�� ����Ʈ�� �հ� �ڰ� ����Ǿ� �ֱ⶧����
		// ����Ʈ�� �������� ��带 �����ϴ°��� �� ����Ʈ�� ù ������ ��带 �����ϴ� �Ͱ� ����
	
	// ù��° ��� ����
	public void insertFirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			newNode.link = newNode;
			// �� ����� ��ũ �ʵ忡 �ڱ� �ڽ��� ����Ű�� ��. ù ��° ������� ������ ��尡 �ǵ��� ����
		} else {
			Node temp = head;
			while(temp.link != head) {
				temp = temp.link;
			}
			newNode.link = temp.link;
			temp.link = newNode;
			head = newNode;
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
	
	/*// ù��° ��� ����
	public void deleteFirst() {
		//Node pre;
		Node temp = head;
		while(temp.link != head) {
			temp = temp.link;
		}
		temp.link = head.link;
	}*/
	
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
		while(temp.link != head) {
			if(data.equals(temp.data)) return temp;
			else temp = temp.link;
		}
		if(temp.link == head) {
			if(data.equals(temp.data)) return temp;
		}
		return null;
	}
	
	// ����Ʈ ����Ʈ
	public void printList() {
		System.out.print("L = (");
		Node temp = head;
		while(temp.link != head) {
			System.out.print(temp.data + ", ");
			temp = temp.link;
		}
		System.out.print(temp.data);
		System.out.println(")");
	}
}

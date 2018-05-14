package linkedList;

public class MyLinkedList {
	private Node head;
	
	public MyLinkedList() {
		head = null;
	}
	
	// 리스트의 마지막에 data 삽입
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
	
	// 리스트의 맨 앞에 data를 삽입
	public void insertFirst(String data) {
		Node newNode = new Node(data);
		if(head == null)
			head = newNode;
		else {
			newNode.link = head;
			head = newNode;
		}
	}
	
	// preData 다음에 data를 삽입
	public void insertMiddle(String preData, String data) {
		Node temp = searchNode(preData);
		if(temp == null) { 
			System.out.println(preData + "를 찾을 수 없습니다.");
		} else {
			Node newNode = new Node(data);
			newNode.link = temp.link;
			temp.link = newNode;
		}
	}
	
	// 리스트의 마지막 원소를 삭제
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
	
	// 리스트를 역순으로 변경
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
	
	// 리스트 원소들을 모두 출력
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
	
	// 리스트에서 data가 저장된 노드를 탐색
	// MyLinkedList 클래스 내부에서 다른 메소드의 보조 역할을 하는 메소드 -> private
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

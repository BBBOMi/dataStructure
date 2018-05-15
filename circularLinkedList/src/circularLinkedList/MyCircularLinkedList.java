package circularLinkedList;

public class MyCircularLinkedList {
	private Node head;
	
	public MyCircularLinkedList() {
		head = null;
	}
	
	/*// 마지막 노드 삽입
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
	}*/ // circularLinkedList는 리스트의 앞과 뒤가 연결되어 있기때문에
		// 리스트의 마지막에 노드를 삽입하는것이 곧 리스트의 첫 번쨰에 노드를 삽입하는 것과 같다
	
	// 첫번째 노드 삽입
	public void insertFirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			newNode.link = newNode;
			// 새 노드의 링크 필드에 자기 자신을 가리키게 함. 첫 번째 노드이자 마지막 노드가 되도록 지정
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
	// 중간 노드 삽입
	public void insertMiddle(String searchData, String data) {
		Node temp = searchNode(searchData);
		if(temp == null) System.out.println(searchData + "를 찾을 수 업습니다.");
		else {
			Node newNode = new Node(data);
			newNode.link = temp.link;
			temp.link = newNode;
		}
	}
	
	// 마지막 노드 삭제
	public void deleteLast() {
		Node pre = head;
		Node temp = pre.link;
		while(temp.link != head) {
			pre = temp;
			temp = temp.link;
		}
		pre.link = head;
	}
	
	/*// 첫번째 노드 삭제
	public void deleteFirst() {
		//Node pre;
		Node temp = head;
		while(temp.link != head) {
			temp = temp.link;
		}
		temp.link = head.link;
	}*/
	
	// 중간 노드 삭제
	public void deleteMiddle(String searchData) {
		Node temp = searchNode(searchData);
		if(temp == null) System.out.println(searchData + "를 찾을 수 없습니다.");
		else {
			Node pre = head;
			while(pre.link != temp) {
				pre = pre.link;
			}
			pre.link = temp.link;
		}
	}
	
	// 노드 검색
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
	
	// 프린트 리스트
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

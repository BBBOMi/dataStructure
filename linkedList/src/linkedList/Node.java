package linkedList;

public class Node {
	String data;
	Node link;
	
	Node() {
		data = null;
		link = null;
	}
	
	Node(String data) {
		this.data = data;
		this.link = null;
	}
	
	Node(String data, Node link) {
		this.data = data;
		this.link = link;
	}

}

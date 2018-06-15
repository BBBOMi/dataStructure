package binarySearchTree;

public class BinarySearchTree {
	private TreeNode root = new TreeNode();
	
	public TreeNode insertKey(TreeNode root, char x) {
		TreeNode p = root;
		TreeNode newNode = new TreeNode();
		newNode.data = x;
		newNode.left = null;
		newNode.right = null;
		
		if(p == null)
			return newNode;
		else if(newNode.data < p.data) {
			p.left = insertKey(p.left, x);
			return p;
		} else if(newNode.data > p.data) {
			p.right = insertKey(p.right, x);
			return p;
		} else
			return p;
	}
	
	public void insertBST(char x) {
		insertKey(root, x);
	}
	
	public TreeNode searchBST(char x) {
		TreeNode p = root;
		while(p != null) {
			if(x < p.data) p = p.left;
			else if(x > p.data) p = p.right;
			else return p;
		}
		return p;
	}
	
	public TreeNode deleteKey(TreeNode startNode, char x) {
		TreeNode parent = startNode;
		TreeNode p = startNode;
		while(p != null && p.data != x) {
			parent = p;
			if(x < p.data) p = p.left;
			else if(x > p.data) p = p.right;
		}
		
		if(p == null) return p;
		
		if(p.left != null && p.right != null) {
			TreeNode q = p.left;
			while(q.right != null) { // 왼쪽 서브트리에서 가장 큰 값의 노드 찾기
				q = q.right;
			}
			//parent.
		} else if(p.left != null || p.right != null) {
			if(p.left != null) {
				if(parent.left == p)
					parent.left = p.left;
				else
					parent.right = p.right;
			} else {
				if(parent.left == p)
					parent.left = p.right;
				else
					parent.right = p.right;
			}
		} else {
			if(parent.left == p) parent.left = null;
			else parent.right = null;
		}

		return p;
	}
	
	public TreeNode deleteBST(char x) {
		return deleteKey(root, x);
	}
	
	public void inorder(TreeNode root) {
		if(root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}
	
	public void printBST() {
		inorder(root);
		System.out.println();
	}

}

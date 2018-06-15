package binarySearchTree;

public class BSTTest {

	public static void main(String[] args) {
		BinarySearchTree BST = new BinarySearchTree();
		BST.insertBST('G');
		BST.insertBST('I');
		BST.insertBST('H');
		BST.insertBST('D');
		BST.insertBST('B');
		BST.insertBST('M');
		BST.insertBST('N');
		BST.insertBST('A');
		BST.insertBST('J');
		BST.insertBST('E');
		BST.insertBST('Q');
		
		System.out.print("BinaryTree >>> ");
		BST.printBST();
		
		System.out.print("\"A\" 검색 >>> ");
		TreeNode p1 = BST.searchBST('A');
		if(p1 != null)
			System.out.println("검색 성공! 검색한 키: " + p1.data);
		else
			System.out.println("검색 실패!");
		
		System.out.print("\"Z\" 검색 >>> ");
		TreeNode p2 = BST.searchBST('Z');
		if(p2 != null)
			System.out.println("검색 성공! 검색한 키: " + p2.data);
		else
			System.out.println("검색 실패!");
		
		System.out.print("\"D\"삭제 >>>");
		TreeNode p3 = BST.deleteBST('D');
		if(p3 != null)
			System.out.println("삭제 성공!");
		else
			System.out.println("삭제 실패!");
		
		System.out.print("BinaryTree >>> ");
		BST.printBST();
	}

}

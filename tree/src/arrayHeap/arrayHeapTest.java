/* 힙 - 완전 이진 트리에 있는 노드 중에서 키값이 가장 큰 노드나 키값이 가장 작은 노드를 찾기 위해 만든 자료구조
 * 	 - 키값이 가장 큰 노드를 찾기 위한 힙을 최대 힙(Max Heap)이라 함
  		- 부모노드의 키값이 자식노드의 키값보다 항상 크거나 캍은크기의 관계를 가지는 노드들의 완전 이진 트리
  			(부모노드의 키값 >= 자식노드의 키값, 루트노드 - 키값이 가장 큰 노드)
 * 	 - 키값이 가장 작은 노드를 찾기 위한 힙을 최소 힙(Min Heap)이라 함
  		- 부모노드의 키값이 자식노드의 키값보다 항상 작거나 같은 크기의 관계를 가지는 노드들의 완전 이진 트리
  			(부모노드의 키값 <= 자식노드의 키값, 루트노드 - 키값이 가장 작은 노드)
 * 		=> 일반적으로 힙은 최대 힙을 의미
 *  	 
 	 - 같은 키값의 노드가 중복될 수 있다
 */
package arrayHeap;

public class arrayHeapTest {

	public static void main(String[] args) {
		int n, item;
		Heap h = new Heap();
		
		h.insertHeap(13);
		h.insertHeap(8);
		h.insertHeap(10);
		h.insertHeap(15);
		h.insertHeap(20);
		h.insertHeap(19);
		
		h.printHeap();
		
		n = h.getHeapSize();
		for(int i=1; i<=n; i++) {
			item = h.deleteHeap();
			System.out.println("deleted Item : [" + item + "]");
		}

	}

}

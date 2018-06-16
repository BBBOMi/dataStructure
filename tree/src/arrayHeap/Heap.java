package arrayHeap;

public class Heap {
	private int heapSize;
	private int[] itemHeap;
	
	public Heap() {
		this.heapSize = 0;
		this.itemHeap = new int[50];
	}
	
	public void insertHeap(int item) {
		int i = ++heapSize;
		while((i != 1) && (item > itemHeap[i/2])) {
			itemHeap[i] = itemHeap[i/2];
			i /= 2;
		}
		
		itemHeap[i] = item;
	}
	
	public int getHeapSize() {
		return this.heapSize;
	}
	
	public int deleteHeap() {
		int item = itemHeap[1];
		int temp = itemHeap[heapSize--];
		int i = 1;
		int j = 2;
		
		while(j <= heapSize) {
			if((j < heapSize) && (itemHeap[j] < itemHeap[j+1]))
				j++;
			if(itemHeap[j] <= temp)
				break;
			else {
				itemHeap[i] = itemHeap[j];
				i = j;
				j *= 2;
			}
		}
		
		itemHeap[i] = temp;
		return item;
	}
	
	public void printHeap() {
		System.out.print("Heap >>> ");
		for(int i=1; i<=heapSize; i++) {
			System.out.print("[" + itemHeap[i] + "] ");
		}
		System.out.println();
	}

}

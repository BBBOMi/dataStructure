package mergeSort;

//시간 복잡도: O(nlogn)(모든 경우)
public class Sort {
	public void mergeSort(int[] a, int start, int end) {
		if(start == end) return;
		int middle = (start + end) / 2;
		mergeSort(a, start, middle);
		mergeSort(a, middle+1, end);
		merge(a, start, middle, end);
	}
	
	public void merge(int[] a, int start, int middle, int end) {
		int length = end - start + 1;
		int[] sorted = new int[length];
		int i = 0;
		int ind1 = start;
		int ind2 = middle + 1;
		
		while(ind1 <= middle && ind2 <= end) {
			if(a[ind1] < a[ind2])
				sorted[i++] = a[ind1++];
			else
				sorted[i++] = a[ind2++];
		}
		
		while(ind1 <= middle) sorted[i++] = a[ind1++];
		while(ind2 <= end) sorted[i++] = a[ind2++];
		
		for(i=0; i<sorted.length; i++)
			a[start+i] = sorted[i];
		
		System.out.printf("%n병합 정렬 >> ");
		for(i=0; i<a.length; i++)
			System.out.printf("%3d", a[i]);
	}

}

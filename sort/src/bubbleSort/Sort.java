package bubbleSort;

public class Sort {
	public void bubbleSort(int[] a) {
		int size = a.length;
		for(int i=size-1; i>0; i--) {
			System.out.printf("%n버블 정렬 %d단계 : ", size-i);
			for(int j=0; j<i ;j++) {
				if(a[j] > a[j+1])
					swap(a, j, j+1);
			
			System.out.printf("%n\t");
			for(int k=0; k<size; k++)
				System.out.printf("%3d ", a[k]);
			}
		}
	}
	
	public void swap(int[] a, int i,int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}

package selectionSort;

public class Sort {
	public void selectionSort(int[] a) {
		int i, min, j;
		for(i=0; i<a.length-1; i++) {
			min = i;
			for(j=i+1; j<a.length; j++) {
				if(a[j] < a[min])
					min = j;
			}
			
			swap(a, i, min);
			System.out.printf("%n선택 정렬 %d단계 : ", i+1);
			for(j=0; j<a.length; j++)
				System.out.printf("%3d", a[j]);
		}
	}
	
	public void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

}

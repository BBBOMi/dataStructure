package insertionSort;

public class Sort {
	public void insertionSort(int[] a) {
		for(int i=1; i<a.length; i++) {
			int value = a[i];
			int j;
			for(j=i-1; j>=0; j--) {
				if(a[j] > value)
					a[j+1] = a[j];
				else break;
			}
			a[j+1] = value;
			
			System.out.printf("%n삽입 정렬 %d단계: ", i);
			for(int k=0; k<a.length; k++)
				System.out.printf("%3d ", a[k]);
		}
	}

}

package shellSort;

public class Sort {
	public void intervalSort(int[] a, int begin, int end, int interval) {
		for(int i=begin+interval; i<=end; i+=interval) {
			int item = a[i];
			int j;
			for(j=i-interval; j>=begin && item < a[j]; j-=interval) {
				a[j+interval] = a[j];
			}
			a[j+interval] = item;
		}
	}
	
	public void shellSort(int[] a) {
		int size = a.length;
		int interval = size/2;
		int count = 0;
		
		while(interval >= 1) {
			for(int i=0; i<interval; i++)
				intervalSort(a, i, size-1, interval);
			
			System.out.printf("%n셸정렬 %d단계 : interval = %d >> ", ++count, interval);
			for(int i=0; i<size; i++)
				System.out.printf("%d   ", a[i]);
			System.out.println();
			interval /= 2;
		}
	}

}

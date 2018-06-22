package mergeSort;

public class MergeSortTest {

	public static void main(String[] args) {
		int[] a = new int[10];
		
		System.out.printf("%n정렬할 원소 : ");
		for(int i=0; i<a.length; i++) {
			a[i] = (int)(Math.random() * 20);
			System.out.printf(" %d", a[i]);
		}		
		
		Sort s = new Sort();
		s.mergeSort(a, 0, a.length-1);

	}

}

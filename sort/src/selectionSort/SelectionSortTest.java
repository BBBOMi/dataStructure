package selectionSort;

public class SelectionSortTest {

	public static void main(String[] args) {
		int[] a = {69, 10, 30, 2, 16, 8, 31, 22};
		Sort s = new Sort();
		
		System.out.println("정렬할 원소");
		for(int i=0; i<a.length; i++)
			System.out.printf("%3d", a[i]);
		System.out.println();
		
		s.selectionSort(a);

	}

}

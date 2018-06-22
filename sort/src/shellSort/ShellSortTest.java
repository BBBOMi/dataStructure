package shellSort;

public class ShellSortTest {

	public static void main(String[] args) {
		int[] a = new int[10];
		
		for(int i=0; i<a.length; i++)
			a[i] = (int)(Math.random() * 20);

		Sort s = new Sort();
		System.out.printf("%n정렬할 원소 : ");
		for(int i : a)
			System.out.printf(" %d", i);
		System.out.println();
		s.shellSort(a);
	}

}

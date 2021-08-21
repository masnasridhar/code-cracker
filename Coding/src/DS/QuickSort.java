package DS;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int a[] = new int[] { 5, 4, 2, 3, 1 };
		int n = a.length;
		int i = 0, j = a.length - 1;
		quickSort(a, i, j);
		Arrays.stream(a).forEach(System.out::println);

	}

	private static void quickSort(int[] a, int low, int high) {
		int p;
		int i, j;
		if (low < high) {
			p = low;
			i = low;
			j = high;
			while (i <= j) {
				while (i <= high && a[i] <= a[p]) {
					i++;
				}
				while (j >= low && a[j] > a[p]) {
					j--;
				}
				if (i <= j) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			int temp = a[p];
			a[p] = a[j];
			a[j] = temp;
			quickSort(a, low, j - 1);
			quickSort(a, j + 1, high);
		}
	}

}

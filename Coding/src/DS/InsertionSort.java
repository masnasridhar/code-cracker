package DS;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int a[] = new int[] { 5, 4, 2, 3, 1 };
		int n = a.length;

		for (int i = 0; i < n; i++) {

			int key = a[i];
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (a[j] > key) {
					a[j + 1] = a[j];
				} else
					break;
			}
			a[j + 1] = key;

		}
		Arrays.stream(a).forEach(System.out::println);
	}

}

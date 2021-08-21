package DS;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int a[] = new int[] { 5, 4, 2, 3, 1 };
		int n = a.length;
		int min;
		for (int i = 0; i < n; i++) {
			min = i;
			for (int j = i+1; j < n; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		Arrays.stream(a).forEach(System.out::println);
	}

}

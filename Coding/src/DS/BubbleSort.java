package DS;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int a[] = new int[] { 5, 4, 2, 3, 1 };
		int n = a.length;
		Boolean isSorted = true;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					isSorted = false;
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			if (isSorted) {
				System.out.println("already sorted");
				break;
			}
		}
		Arrays.stream(a).forEach(System.out::println);
	}

}

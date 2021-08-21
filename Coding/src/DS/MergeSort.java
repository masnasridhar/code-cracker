package DS;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int a[] = new int[] { 5, 4, 2, 3, 1 };
		int n = a.length;

		mergesort(a, 0, n - 1);
		Arrays.stream(a).forEach(i -> System.out.println(i));
	}

	private static void mergesort(int[] a, int low, int high) {

		if (low < high) {
			int mid = (low + high) / 2;
			mergesort(a, low, mid);
			mergesort(a, mid + 1, high);
			merge(a, low, mid, high);
		}

	}

	private static void merge(int[] a, int low, int mid, int high) {
		int lowLength = mid - low + 1;
		int highLength = high - mid;
		int l[] = new int[lowLength];
		int r[] = new int[highLength];
		for (int i = 0; i < lowLength; i++) {
			l[i] = a[low + i];
		}
		for (int i = 0; i < highLength; i++) {
			r[i] = a[mid + 1 + i];
		}
		int i = 0, j = 0, k = low;
		while (i < lowLength && j < highLength) {
			if (l[i] < r[j]) {
				a[k++] = l[i];
				i++;
			} else {
				a[k++] = r[j];
				j++;
			}
		}
		while (i < lowLength) {
			a[k++] = l[i];
			i++;
		}
		while (j < highLength) {
			a[k++] = r[j];
			j++;
		}
	}

}

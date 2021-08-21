package Array;
public class FindAndReoveDuplicatesInArray {

	void dupAll(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					// got the duplicate element } } }
				}
			}
		}
	}

	// find duplicates elements from 0 to n-1
	static void printRepeating(int arr[], int size) {
		int i;
		for (i = 0; i < size; i++) {
			if (arr[Math.abs(arr[i])] >= 0)
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			else
				System.out.print(Math.abs(arr[i]) + " ");
		}
		System.out.println("");
	}

	static void printRepeatingLatest(int arr[], int n) {
		// First check all the values that are present in an array then go to that
		// values as indexes and increment by the size of array
		for (int i = 0; i < n; i++) {
			int index = arr[i] % n;
			arr[index] += n;
		}
		// Now check which value exists more than once by dividing with the size of
		// array
		for (int i = 0; i < n; i++) {
			if ((arr[i] / n) > 1)
				System.out.print(i + " ");
		}
		System.out.println("");
	}

	// remove duplicates for sorted array
	static int removeDuplicatesInSortedArray(int arr[], int n) {
		if (n == 0 || n == 1)
			return n;
		int j = 0;
		for (int i = 0; i < n - 1; i++)
			if (arr[i] != arr[i + 1])
				arr[j++] = arr[i];
		arr[j++] = arr[n - 1];
		return j;
	}

	public static int[] removeDuplicates(int[] arr) {
		int end = arr.length;
		for (int i = 0; i < end; i++) {
			for (int j = i + 1; j < end; j++) {
				if (arr[i] == arr[j]) {
					int shiftLeft = j;
					for (int k = j + 1; k < end; k++, shiftLeft++) {
						arr[shiftLeft] = arr[k];
					}
					//or arr[j]=arr[end-1];
					end--;
					j--;
				}
			}
		}
		int[] whitelist = new int[end];
		for (int i = 0; i < end; i++) {
			whitelist[i] = arr[i];
		}
		return whitelist;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 6, 3, 1, 3, 6, 6 };
		int arr_size = arr.length;
		// printRepeating(arr, arr_size); //output 1 3 6 6
		printRepeatingLatest(arr, arr_size); // output 1 3 6
		printArray(arr);
		int sortedArray[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
		int n = sortedArray.length;
		n = removeDuplicatesInSortedArray(sortedArray, n);// output 1 2 3 4 5
		for (int i = 0; i < n; i++)
			System.out.print(sortedArray[i] + " ");
	}

	private static void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print((arr[i] % n) + " ");
		}
		System.out.println("");
	}
}

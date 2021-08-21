package Array;
class RepeatElement {
	void printRepeatingElements(int arr[], int size) {
		int count[] = new int[size];
		int i;

		System.out.print("Repeated elements are : ");
		for (i = 0; i < size; i++) {
			if (count[arr[i]] == 1)
				System.out.print(arr[i] + " ");
			count[arr[i]]++;
		}
		System.out.println("");
	}

	void printRepeatingElementsCounts(int arr[], int size) {
		int count[] = new int[size];
		int i;
		System.out.println("Repeated counts are : ");
		for (i = 0; i < size; i++) {
			count[arr[i]]++;
		}
		for (i = 0; i < size; i++) {
			if (count[arr[i]] > 1) {
				System.out.println(arr[i] + " : " + count[arr[i]]);
				count[arr[i]] = 0;
			}
		}
	}

	public static void main(String[] args) {
		RepeatElement repeat = new RepeatElement();
		int arr[] = { 4, 2, 4, 5,4, 2,  1 };
		int arr_size = arr.length;
		repeat.printRepeatingElements(arr, arr_size);
		repeat.printRepeatingElementsCounts(arr, arr_size);
	}
}
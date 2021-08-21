package Array;
import java.util.Arrays;
public class LargestAndSmallestInArray {
	public static void largestAndSmallest(int[] numbers) {
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for (int number : numbers) {
			if (number > largest) {
				largest = number;
			} 
			if (number < smallest) {
				smallest = number;
			}
		}
		System.out.println("Given integer array : " + Arrays.toString(numbers));
		System.out.println("Largest number in array is : " + largest);
		System.out.println("Smallest number in array is : " + smallest);
	}
	public static void secondLargest(int[] numbers) {
		int largest = Integer.MIN_VALUE;
		int scondLarge=Integer.MIN_VALUE;
		for (int number : numbers) {
			if (number > largest) {
				scondLarge=largest;
				largest = number;
			} else if (scondLarge < number) {
				scondLarge = number;
			}
		}
		System.out.println("Largest number in array is : " + largest);
		System.out.println("Second Largest number in array is : " + scondLarge);
	}
	public static void secondMin(int[] numbers) {
		int min = Integer.MAX_VALUE;
		int secondMin= Integer.MAX_VALUE;
		for (int number : numbers) {
			if (number < min) {
				secondMin=min;
				min = number;
			} else if (secondMin > number) {
				secondMin = number;
			}
		}
		System.out.println("Min number in array is : " + min);
		System.out.println("Second Min number in array is : " + secondMin);
	}
	public static void main(String[] args) {
		largestAndSmallest(new int[] { 1 ,2, 5, 7, 3 ,9 });
//		largestAndSmallest(new int[] { 10, Integer.MIN_VALUE, -2 });
//		largestAndSmallest(new int[] { Integer.MAX_VALUE, 40, Integer.MAX_VALUE });
//		largestAndSmallest(new int[] { 1, -1, 0 });
		secondLargest(new int[] { 1 ,2 ,5 ,7 ,3, 9});
		secondMin(new int[] { 1 ,2 ,5, 7, 3, 9});
	}
}

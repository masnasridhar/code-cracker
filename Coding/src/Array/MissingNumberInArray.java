package Array;

public class MissingNumberInArray {
	public static void main(String[] args) {
		int[] iArray = new int[] { 1, 2, 3, 5 };
		int missingNum = getMissingNumber(iArray, 5);
		System.out.println(missingNum);
	}
	private static int getMissingNumber(int[] numbers, int totalCount) {
		int expectedSum = totalCount * ((totalCount + 1) / 2);
		int actualSum = 0;
		for (int i : numbers) {
			actualSum += i;
		}
		return expectedSum - actualSum;
	}
}

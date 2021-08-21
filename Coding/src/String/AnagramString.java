package String;
import java.util.Arrays;
public class AnagramString {
	public static int NO_OF_CHARS = 256;
	static boolean areAnagram(char str1[], char str2[]) {
		int count[] = new int[NO_OF_CHARS];
//		Arrays.fill(count, 0);
		int i;
		for (i = 0; i < str1.length && i < str2.length; i++) {
			count[str1[i]]++;
			count[str2[i]]--;
		}
		if (str1.length != str2.length)
			return false;
		for (i = 0; i < NO_OF_CHARS; i++)
			if (count[i] > 0)
				return false;
		return true;
	}
	public static void main(String[] args) {
		char str1[] = ("geeksforgeeks").toCharArray();
		char str2[] = ("forgeeksgeeks").toCharArray();
		System.out.println(areAnagram(str1, str2));
	}
}

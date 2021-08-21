package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicatesInString {
	static final int NO_OF_CHARS = 256;

	/* Fills count array with frequency of characters */
	static void fillCharCounts(String str, int[] count) {
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;
	}

	/* Print duplicates present in the passed string */
	static void printDups(String str) {
		// Create an array of size 256 and fill count of every character in it
		int count[] = new int[NO_OF_CHARS];
		fillCharCounts(str, count);

		for (int i = 0; i < NO_OF_CHARS; i++)
			if (count[i] > 1)
				System.out.printf("%c,  count = %d \n", i, count[i]);
	}

	public static void main(String[] args) {
		String str = "test string";
		printDups(str);
	}

	public static void printDuplicateCharacters(String word) {
		char[] characters = word.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character ch : characters) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		System.out.printf("List of duplicate characters in String '%s' %n", word);
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
			}
		}
	}
}
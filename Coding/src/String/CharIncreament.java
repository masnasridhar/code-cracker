package String;
public class CharIncreament {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("a2d3z");//output b3E4A
//		String x = "";
		for (int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			char l = (char) (c + 1);
			if (c == 'z')
			      l = 'a';
			if ("aeiou".indexOf(l) != -1) {
//			      l = Character.toUpperCase(l);
			      l=(char) (l-'a'+'A');
			}
			s.setCharAt(i, l);
//			x = x + l;
		}
		System.out.println(s);
	}
}

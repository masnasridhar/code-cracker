package String;

public class WordsReverse {

	public static void main(String args[]) {
		
		/*String s=new String("abcd xyz");
		char[] charArray = s.toCharArray();
		int n=charArray.length;
		for (int i=0;i<charArray.length/2; i++) {
			char c = charArray[n-i-1];
			charArray[n-i-1]=charArray[i];
			charArray[i]=c;
		}
		System.out.println(String.valueOf(charArray));
		*/
		
		//indexOf,charAt,setCharAt,length
		StringBuilder s=new StringBuilder("abcd xyz");
		
		System.out.println(s);
		int index=0;
		int n=s.length();
		for (int i=0;i<s.length(); i++) {
			char c = s.charAt(i);
			if(c==' '||i==n-1) {
				if(i==n-1)
					i=i+1;
				/*for (int j=index,k=0;j<(i+index)/2; j++,k++) {
					char c1 = s.charAt(i-k-1);
					s.setCharAt(i-k-1, s.charAt(j));
					s.setCharAt(j,c1);
				}*/
				for (int j=index,k=i-1;j<k; j++,k--) {
					char c1 = s.charAt(j);
					s.setCharAt(j, s.charAt(k));
					s.setCharAt(k,c1);
				}
				
				index=i+1;
			}
		}
		System.out.println(s);
		stringReveerse(s);
		System.out.println(s);
		
		
}

	private static void stringReveerse(StringBuilder s) {
		int n=s.length();
		for (int i=0;i<s.length()/2; i++) {
			char c = s.charAt(n-i-1);
			s.setCharAt(n-i-1, s.charAt(i));
			s.setCharAt(i,c);
		}		
	}
}

package String;

import java.util.Scanner;

public class StringRev {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder s = new StringBuilder(str);
		for(int i=0,j=s.length()-1;i<j;i++,j--) {
			char charAt = s.charAt(j);
			s.setCharAt(j, s.charAt(i));
			s.setCharAt(i, charAt);
		}
		System.out.println(s);
		
		String stringRev="";
		for(int i=0;i<s.length();i++)
		{
			stringRev=stringRev.concat(s.charAt(s.length()-i-1)+"");
		}
		System.out.println(stringRev);
	}
}

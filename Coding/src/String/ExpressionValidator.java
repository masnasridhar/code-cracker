package String;

import java.util.Stack;
public class ExpressionValidator {
	static String isBalanced(char[] s) {
		Stack<Character> stk = new Stack<Character>();
		for (int i = 0; i < s.length; i++) {
			if (s[i] == '(')
				stk.push(')');
			if (s[i] == '[')
				stk.push(']');
			if (s[i] == '{')
				stk.push('}');

			if (s[i] == '}' || s[i] == ')' || s[i] == ']') {
				if (stk.peek() == s[i])
					stk.pop();
			}
		}
		if (stk.empty())
			return "YES";
		else
			return "NO";
	}
	public static void main(String args[]) {
		System.out.println(isBalanced("{(a+b*c)/d}".toCharArray()));
	}
}

package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Stack_1918 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine().toUpperCase();
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();

		for(int i=0; i<s.length(); i++) {
			
			char c = s.charAt(i);
			
			if(c >= 'A' && c <= 'Z') 
			{  
				sb.append(c);				
			}else {
				
				switch(c) {
				case '(': 
					stack.push(c); 
					break;
				case ')':
					while(!stack.isEmpty() && stack.peek() != '(') {
						sb.append(stack.pop());
					}
					stack.pop();
					break;
				case '+' :
				case '-' :
					while(!stack.isEmpty() && stack.peek() != '(') {
						sb.append(stack.pop());
					}
					stack.push(c);
					break;
				case '*' :
				case '/' :
					while(!stack.isEmpty() && (stack.peek() == '*' || stack.peek() == '/')) {
						sb.append(stack.pop());
					}
					stack.push(c);
					break;
				} // switch 
			}

		}// for

		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}		
		
		System.out.println(sb.toString());
	}
}

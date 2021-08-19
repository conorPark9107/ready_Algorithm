package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// https://www.acmicpc.net/problem/4949
public class String_4949 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] charArr;
		Stack<Character> stack = null;
		StringBuilder sb = new StringBuilder();
		
		
		while(true)
		{
			charArr = br.readLine().toCharArray();
			if(charArr.length == 1 && charArr[0] == '.') break;
			
			stack = new Stack<>(); // 소괄호
			boolean status = true;
			
			for(char c : charArr) {
				
				if(c == '(' || c == '[') {
					stack.push(c);
					
				}else if(c == ')'){
					if(!stack.isEmpty() && stack.peek() == '(') {
						stack.pop();
					}else {
						status = false;
						break;
					}
					
				}else if(c == ']') {
					if(!stack.isEmpty() && stack.peek() == '[') {
						stack.pop();
					}else {
						status = false;
						break;
					}
				}
				
			}// for
			
			if(stack.size() == 0 && status) {
				sb.append("yes").append("\n");
			}else {
				sb.append("no").append("\n");
			}
		}
		System.out.println(sb.toString());

	}

}

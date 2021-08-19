package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 쇠막대기
// https://www.acmicpc.net/problem/10799
public class Stack_10799 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] brackets = br.readLine().toCharArray();
		Stack<Character> stack = new Stack<>();
		int cutSticks = 0;
		
		for(int i=0; i<brackets.length; i++) 
		{
			char c = brackets[i];
			if(c == '(') {
				stack.push(c);
			}else {
				stack.pop();
				
				if(brackets[i-1] == '(') {
					cutSticks += stack.size();
				}else {
					cutSticks += 1;
				}
			}
		}
		
		System.out.println(cutSticks);
		
		
	}

}

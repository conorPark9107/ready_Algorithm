package baekjoon;

import java.util.Scanner;
import java.util.Stack;

// 후위 표기식 2
// https://www.acmicpc.net/problem/1935
public class Stack_1935 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		String line = sc.nextLine();
		int[] numbers = new int[n];
		Stack<Double> stack = new Stack<>();
		
		for(int i=0; i<n; i++) {
			numbers[i] = sc.nextInt();
			
		}
		
		for(int i=0; i<line.length(); i++) {
			
			char c = line.charAt(i);

			if(c >= 'A'&& c <= 'Z') {
				stack.push((double)numbers[c-65]);
			}else {
				double b = stack.pop();
				double a = stack.pop();
				double ab = 0;
				
				switch(c) {
					case '+' : ab = a + b; break;
					case '*' : ab = a * b; break;
					case '-' : ab = a - b; break;
					case '/' : ab = a / b; break;
				}
				stack.push(ab);
			}
			
		}// end for
		
		System.out.println(String.format("%.2f", stack.peek()));
		
	}

}

package baekjoon;

import java.util.Scanner;
import java.util.Stack;

// https://www.acmicpc.net/problem/10773
public class String_10773 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		long sum = 0;

		for(int i = 0; i < n; i++) 
		{
			int input = sc.nextInt();
			if(input == 0) {
				stack.pop();
			}else {
				stack.add(input);				
			}
		}

		for(Integer value : stack) {
			sum += value;
		}
		System.out.println((long)sum);
		
	}

}

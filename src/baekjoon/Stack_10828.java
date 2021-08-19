package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 스택
// https://www.acmicpc.net/problem/10828
public class Stack_10828 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[] commands = new String[n]; 
		for(int i=0; i<n; i++) {
			commands[i] = br.readLine();
		}
		
		br.close();
		
		StackExam stack = new StackExam(n);
		
		for(int i=0; i<commands.length; i++) {
			String[] command = commands[i].split(" ");
			switch(command[0]) {
				case "push" : 
					stack.push(Integer.parseInt(command[1]));
					break;
				case "pop" :
					System.out.println("pop : " + stack.pop());
					break;
				case "size" : 
					System.out.println("size : " + stack.size());
					break;
				case "empty" : 
					System.out.println("empty : " + stack.empty());
					break;
				case "top" : 
					System.out.println("top : " + stack.top());
					break;
			}
		}
		
		

	}

}

class StackExam{
	
	int[] array;
	int top = 0;
	int size = 0;
	
	public StackExam(int size) {
		this.size = size;
		this.array = new int[this.size];
		for(int i=0; i<size; i++) {
			array[i] = -1;
		}
	}
	
	public void push(int x) {
		array[top++] = x;
	}
	
	public int pop() {
		if(top == 0) {
			top = 0;
			return -1;
		}
		int popVal = array[top-1];
		array[top-1] = -1;
		top = top-1 < 0? 0 : top-1;
		return popVal;
	}
	
	public int size() {
		return top;
	}
	
	public int empty() {
		return top <= 0? 1 : 0;
	}
	
	public int top() {
		return top == 0? -1 : array[top-1];
	}
}

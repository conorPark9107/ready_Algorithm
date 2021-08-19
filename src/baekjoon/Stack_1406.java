package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

// 에디터
// https://www.acmicpc.net/problem/1406
public class Stack_1406 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] inputString = br.readLine().split("");
		int n = Integer.parseInt(br.readLine());

		Stack<String> left = new Stack<>();
		Stack<String> right = new Stack<>();
		
		for (int i = 0; i < inputString.length; i++) {
			left.push(inputString[i]);
		}

		for (int i = 0; i < n; i++) {
			
			StringTokenizer token = new StringTokenizer(br.readLine());
			String command = token.nextToken();
			switch (command) {

			case "L":
				if(!left.isEmpty()) right.push(left.pop());
				break;

			case "D":
				if(!right.isEmpty()) left.push(right.pop());
				break;

			case "B":
				if(!left.isEmpty()) left.pop();
				break;

			case "P":
				left.push(token.nextToken());
				break;
				
			}
			
		}
		
		while(!left.isEmpty()) {
			right.push(left.pop());
		}
		while(!right.isEmpty()) {
			bw.write(right.pop());
		}
		bw.flush();
		bw.close();
	}

}

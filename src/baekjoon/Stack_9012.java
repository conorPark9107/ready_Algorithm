package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 괄호
public class Stack_9012 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String line = "";
		for(int i=0; i<n; i++) {
			line = br.readLine();
			Stack<Character> stack = new Stack<>();
			char temp;
			boolean answer = true;
			
			for(int j=0; j<line.length(); j++) {
				temp = line.charAt(j);
				if(temp == '(') { // 여는 괄호 '('일 경우 stack에 push
					stack.push(temp);
					
				}else { // 닫는 괄호')'일 경우에는 Stack에 여는 괄호가 있을경우 빼내 주고 stack이 비어있을 경우에는 괄호가 맞지 않음.
					if(!stack.isEmpty()) { 
						stack.pop();
					}else {
						answer = false;
						break;
					}
				}
			} // end for (j)
			
			if(!stack.isEmpty()) { // 임무 수행 후 스택에 여는괄호가 남아 있을경우
				answer = false;
			}
			
			if(answer) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
			
		}// end for (i)

	}

}
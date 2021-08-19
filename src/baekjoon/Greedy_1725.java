package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 히스토그램
public class Greedy_1725 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		
		int[] histogram = new int[N + 1];
		for(int i = 0; i < N; i++) {
			histogram[i] = Integer.parseInt(br.readLine());
		}
		histogram[N] = 0;
		
		
		// 1) 스택 생성
		long ans = 0;
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < N; i++) 
		{
			
			// now : 현재 선택된 막대
			int now = histogram[i];
			
			// 2) 스택이 비었다면 push
			if(stack.isEmpty()) 
			{
				stack.push(i); 
				continue;
			}
			
			
			// 3) 스택의 top보다 현재 막대가 크다면 push
			if(histogram[stack.peek()] < now) 
			{
				stack.push(i);
				continue;
			}
			
			// 4) 스택의 top보다 작거나 같은 경우.
			// 스택의 top 막대 * 현재 선택된 막대와의 거리(i or i - 1 - stack.peek())
			while(!stack.isEmpty() && histogram[stack.peek()] >= now) 
			{
				int height = histogram[stack.pop()];
				long width = stack.isEmpty() ? i : i - stack.peek() - 1;
				ans = Math.max(ans, height *  width);
			}
			stack.push(i);
		}
		
		// 5) 마지막으로 스택에 남은 데이터가 있다면 4번 과정 반복.
		while(!stack.isEmpty())
		{
			int height = histogram[stack.pop()];
			int width = stack.isEmpty()? N : N - stack.peek() - 1;
			ans = Math.max(ans, height * width);
		}
		
		System.out.println(ans);
	}

}

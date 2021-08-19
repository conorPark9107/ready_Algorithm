package programmers;

import java.util.Stack;

// 다트 게임
// https://programmers.co.kr/learn/courses/30/lessons/17682
public class Level01_2018KakaoBlind {

	public static void main(String[] args) {
//		int answer = solution("1S2D*3T");
//		System.out.println(answer); // 37
//		
//		answer = solution("1D2S#10S");
//		System.out.println(answer); // 9
//		
//		answer = solution("1S*2T*3S");
//		System.out.println(answer); // 23
//		
//		answer = solution("1D#2S*3S");
//		System.out.println(answer); // 5
		
		int answer = solution("0S2D*3T*");
		System.out.println(answer); // 72
		
//		answer = solution("1S2D3T*");
//		System.out.println(answer); // 63
		
		
	}

	private static int solution(String dartResult) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < dartResult.length(); i++)
		{
			char c = dartResult.charAt(i);
			
			// 점수
			if(c >= '0' && c <= '9') {
				if(c == '0') {
					if(stack.size() > 0 && stack.peek() == 1) {
						stack.pop();
						stack.push(10);
					}else {
						stack.push(0);
					}
					
				}else {
					stack.push(c - 48);
				}
				continue;
			}
			
			// 보너스, 옵션
			switch(c) {
			
				case 'S' :
					stack.push((int)Math.pow(stack.pop(), 1));
					break;
					
				case 'D' :
					stack.push((int)Math.pow(stack.pop(), 2));
					break;	
					
				case 'T' :
					stack.push((int)Math.pow(stack.pop(), 3));
					break;
				
				case '#' :
					stack.push(stack.pop() * -1);
					break;
					
				case '*' :
					int now = stack.pop(); // 현재 점수.
					if(stack.size() >= 1) {
						int prev = stack.pop(); // 이전 점수.
						stack.push(prev * 2);
					}
					stack.push(now * 2);
					
					break;
			}
			
			
		}// for
		
		while(!stack.isEmpty()) {
			answer += stack.pop();
		}
		
		return answer;
	}

}

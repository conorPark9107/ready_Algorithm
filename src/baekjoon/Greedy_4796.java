package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 캠핑
// https://www.acmicpc.net/problem/4796
public class Greedy_4796 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int i = 1;
		while(true) {
			int answer = 0;
			String[] arr = br.readLine().split(" ");
			
			// V일 짜리 휴가를 받아서 캠핑장을 연속된 P일 중에 L일 동안만 사용할 수 있음.
			int V = Integer.parseInt(arr[2]); 
			int P = Integer.parseInt(arr[1]);
			int L = Integer.parseInt(arr[0]);
			
			
			if(L == 0) break;
			
			int a = V / P;
			int b = V % P;
			
			answer += a * L;
			answer += Math.min(b, L);
			
			System.out.println("Case " + i++ + ": " + answer);
			
		}
		
		
	}

}

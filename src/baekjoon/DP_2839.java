package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 설탕 배달
//https://www.acmicpc.net/problem/2839
public class DP_2839 {

	public static void main(String[] args) throws IOException {

		// 1) 배달해야할 설탕 N킬로그램 입력받기.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	
		System.out.println(dp(N));
		System.out.println(dp2(N));
		System.out.println(greedy(N));
	}
	

	private static int greedy(int N) {
		int answer = 0; 
		while(N > 0) 
		{
			// 2) 5로 나누어 떨어질 경우 나눈다.
			if(N % 5 == 0) 
			{ 
				answer += N / 5;
				N = N % 5;
				
			}else 
			{
				// 3) 나누어 떨어지지 않을 경우 = 3 감소, answer 1증가
				N -= 3;
				answer++;
				if(N < 0) return -1;
			}
		}
		return answer;
	}
	
	private static int dp(int N) {
		
		// 2) dp배열 생성, dp[i]일 때, i킬로그램의 설탕을 배달할 경우 최소봉지의 수.
		int[] dp = new int[N + 1];
		dp[3] = 1;
		
		for (int i = 4; i <= N; i++) 
		{
			
			if(i % 5 == 0)
			{
				// 3) 5로 나누어 떨어지면 dp[i-5] + 1
				dp[i] = dp[i-5] + 1;
			}else if(dp[i-3] != 0) 
			{	
				// 4) dp[i-3]이 배열 생성시 초기값인 0이 아닐 경우 -> dp[i-3] + 1
				dp[i] = dp[i-3] + 1;
			}
		}
		// dp[N] = 0인 경우는 정확하게 N킬로그램 배달할 수 없다는 말이므로 -1을 return
		return dp[N] == 0? -1 : dp[N];
	}
	
	
	private static int dp2(int N) {
		
		// 2) dp배열 생성, dp[i]일 때, i킬로그램의 설탕을 배달할 경우 최소봉지의 수.
		int[] dp = new int[N + 1];
		if(N >= 3) dp[3] = 1;
		if(N >= 5) dp[5] = 1;

		for (int i = 6; i <= N; i++) 
		{
			
			if(i % 5 == 0)
			{
				// 3-1) 5의 배수인 경우 : dp[i-5] + 1
				dp[i] = dp[i-5] + 1;
			}else if(i % 3 == 0) 
			{	
				// 3-2) 3의 배수인 경우 : dp[i-3] + 1
				dp[i] = dp[i-3] + 1;
			}else 
			{
				// 4) 5와 3의 조합인 수일 경우 : ﻿dp[i] = min(dp[i-5], dp[i-3]) + 1
				if(dp[i-5] != 0 && dp[i-3] != 0)
				{
					dp[i] = Math.min(dp[i-5], dp[i-3]) + 1;
				}
			}
		}
		
		return dp[N] == 0? -1 : dp[N];
	}
	

}

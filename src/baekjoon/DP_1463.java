package baekjoon;

import java.util.Scanner;

//
public class DP_1463 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] dp = new int[N+1];
		dp[0] = 0;
		dp[1] = 0;
		int result = bottom_up(dp, N);
		
		int[] dp2 = new int[N+1];
		int result2 = top_down(dp2, N);
		
		System.out.println("bottom_up : " + result);
		System.out.println("top_down : " + result2);
	}
	
	
	public static int bottom_up(int[] dp, int N) {
		for(int i = 2; i <= N; i++) {
			dp[i] = dp[i-1] + 1;
			
			if(i % 3 == 0) {
				dp[i] = Math.min(dp[i / 3] + 1, dp[i]);
			}
			if(i % 2 == 0) {
				dp[i] = Math.min(dp[i / 2] + 1, dp[i]);
			}
		}
		
		return dp[N];
	}
	
	public static int top_down(int dp[], int N) {
		if(N == 1) return 0; // N == 1일 때
		if(dp[N] != 0) return dp[N]; // 계산한 적이 있을 때
		
		int result = top_down(dp, N-1) + 1;
		if(N % 3 == 0) result = Math.min(result, top_down(dp, N/3) + 1);
		if(N % 2 == 0) result = Math.min(result, top_down(dp, N/2) + 1);
		dp[N] = result;
		return result;
	}
	
	
	
	
	
}

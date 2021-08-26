package baekjoon;

import java.util.Scanner;

// 1로 만들기
//https://www.acmicpc.net/problem/1463
public class DP_1463 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// 1) dp배열은 dp[i]일 때, i를 1로 만드는 최소횟수를 저장할 배열이다.
		//    명시적으로 dp[0], dp[1]은 0으로 초기화
		int[] dp = new int[N+1];
		dp[0] = 0;
		dp[1] = 0;
		
		// 2) i를 2부터 시작한다.
		// 점화식 : dp[i] = min(dp[i-1]+1, dp[i/2]+1, dp[i/3]+1)
		for(int i = 2; i <= N; i++)
		{
			dp[i] = dp[i-1] + 1;
			if(i % 2 == 0) dp[i] = Math.min(dp[i], dp[i/2] + 1);
			if(i % 3 == 0) dp[i] = Math.min(dp[i], dp[i/3] + 1);
		}
		
		// 결과 출력.
		System.out.println(dp[N]);
		
		
	}
	
	
	
	
	
}

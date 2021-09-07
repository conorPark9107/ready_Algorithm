package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

// 퇴사
// https://www.acmicpc.net/problem/14501
public class DP_14501 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		
		int[] time = new int[n + 1];
		int[] price = new int[n + 1];
		for(int i = 1; i < n + 1; i++)
		{
			StringTokenizer t = new StringTokenizer(br.readLine());
			time[i] = Integer.parseInt(t.nextToken());
			price[i] = Integer.parseInt(t.nextToken());
		}
		
		// 1) 거꾸로 진행.
		int[] dp = new int[n + 2];
		for(int i = n; i > 0; i--)
		{
			// 2) 현재 시간 + 상담시간 < 퇴사일
			if (i + time[i] <= n + 1)
			{
				// 3) 점화식 : dp[i] = max(dp[i+1], dp[현재시간 + 상담시간])
				dp[i] = Math.max(dp[i + 1], price[i] + dp[i + time[i]]);
			}else
			{
				dp[i] = dp[i + 1];
			}
		}
		System.out.println(dp[1]);
	}
}


//// 풀리는긴하는데... 잘못된 코드
//private static void f(int n, BufferedReader br) throws IOException {
//
//	// 1) 2차원 배열로 입력받기, [i][0]:시간, [i][1]:가격
//	int[][] arr = new int[n][2];
//
//	// 2) dp[i] = i번째 시간에 받을수 있는 가장 큰 가격.
//	dp = new int[n + 1];
//
//	for(int i = 0; i < n; i++)
//	{
//		StringTokenizer t = new StringTokenizer(br.readLine());
//		arr[i][0] = Integer.parseInt(t.nextToken());
//		arr[i][1] = Integer.parseInt(t.nextToken());
//		
//		// 3) 현재 시간(i) + 현재 상담일의 걸리는 시간(arr[i][0]) <= 퇴사일 하루전
//		// dp[i] = 현재 상담의 가격으로 초기화.
//		if(i + arr[i][0] < n + 1)
//		{
//			dp[i + 1] = arr[i][1];
//		}
//	}
//
//	// 4) dp[j] = max(dp[j], dp[i] + price)
//	for(int i = 1; i <= n; i++)
//	{
//		int afterTime = i + arr[i - 1][0]; // 상담 후 시간.
//		for(int j = afterTime; j <= n; j++) 
//		{
//			// 상담 후 시간이 퇴사하기전인 경우.
//			if(j + arr[j - 1][0] <= n + 1)
//			{
//				int afterPrice = dp[i] + arr[j - 1][1];
//				dp[j] = Math.max(dp[j], afterPrice);
//			}
//		}
//
//	}
//
//	int answer = dp[1];
//	for(int i = 1; i <= n; i++) 
//	{
//		answer = Math.max(answer, dp[i]);
//	}
//	System.out.println(answer);
//
//}
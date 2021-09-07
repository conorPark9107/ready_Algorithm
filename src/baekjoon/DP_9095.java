package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1, 2, 3 더하기
// https://www.acmicpc.net/problem/9095
public class DP_9095 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		// 1) 입력받는 n의 범위는 (0 < n < 11)
		int[] dp = new int[11];
		
		// 2) 초기값 설정
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		// 3) 점화식 dp[n] = dp[n-1] + dp[n-2] + dp[ni-3]
		for(int n = 4; n < 11; n++)
		{
			dp[n] = dp[n-1] + dp[n-2] + dp[n-3];
		}
		
		// 4) testCase만큼 반복하며 결과 값 출력
		for(int i=0; i<T; i++)
		{
			System.out.println(dp[Integer.parseInt(br.readLine())]);
		}
	}
}

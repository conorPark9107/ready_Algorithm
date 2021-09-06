package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1, 2, 3 더하기
// https://www.acmicpc.net/problem/9095
public class DP_9095 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 1) 테스트 케이스 입력받기.
		int T = Integer.parseInt(br.readLine());
		
		
		// 2) 입력받는 n의 범위는 (0 < n < 11) 이므로 1 ~ 10까지의 dp 테이블 생성
		int[] dp = new int[11];
		
		// 3) 초기값 설정
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		// 4) 점화식 dp[i] = dp[i-1] + dp[i-2] + dp[i-3]
		for(int i = 4; i < 11; i++)
		{
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		
		// 5) testCase만큼 반복하며 결과 값 출력
		for(int i=0; i<T; i++)
		{
			System.out.println(dp[Integer.parseInt(br.readLine())]);
		}
	}
}

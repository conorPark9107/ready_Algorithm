package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 신입 사원
// https://www.acmicpc.net/problem/1946
public class Greedy_1946 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token;
		int T = parseInt(br.readLine());
		while(T-- > 0)
		{
			
			// 1) 입력받음과 동시에 서류심사 순위 기준으로 정렬
			int N = parseInt(br.readLine());
			int[]array = new int[N + 1];
			for(int i = 0; i < N; i++) 
			{
				// x = 서류심사 순위, y = 면접심사 순위
				token = new StringTokenizer(br.readLine());
				int f = parseInt(token.nextToken());
				int s = parseInt(token.nextToken());
				array[f] = s; 
			}
			
			// 2) 서류심사가 가장 높은 순위인 사람의 면접순위를 컷트라인으로 잡고,
			int cutLine = array[1];
			int answer = 1;
			for(int i = 2; i <= N; i++)
			{
				// 3) 면접순위가 더 낮은 순위의 지원자인 경우, 해당 면접 순위로 컷트라인을 수정 및 지원자 선발.
				if(cutLine > array[i]) 
				{
					answer++;
					cutLine = array[i];
				}
			}
			
			// 정답.
			System.out.println(answer);
		}
	}
	
	public static int parseInt(String s) {
		return Integer.parseInt(s);
	}

}
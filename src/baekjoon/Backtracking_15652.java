package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N과 M (4) 
public class Backtracking_15652 {
	
	static int N;
	static int M;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sArr = br.readLine().split(" ");
		N = Integer.parseInt(sArr[0]); // 1부터 N까지
		M = Integer.parseInt(sArr[1]); // 길이가 M인 수열
		arr = new int[M+1];
		
		function(1, 0);
		
		System.out.println(sb.toString());
	}
	
	/*
	 * 1. 같은 수를 여러 번 골라도 된다.
	 * 2. 고른 수열은 비내림차순이어야 한다.
	 * 3. 1부터 N까지 자연수 중에서 M개를 고른 수열
	 */
	private static void function(int now, int len) {
		if(len == M) {
			for(int i = 0; i < M; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = now; i <= N; i++) {
			arr[len] = i;
			function(i, len + 1);
		}
		
	}

}

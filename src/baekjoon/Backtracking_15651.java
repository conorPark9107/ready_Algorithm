package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// N과 M (3) 
public class Backtracking_15651 {
	
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
		
		function(0);
		System.out.println(sb.toString());
	}

	private static void function(int len) {
		if(len == M) {
			for(int i = 0 ; i < M; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 1; i <= N; i++) { 
			arr[len] = i;
			function(len + 1);
		}
		
	}

}

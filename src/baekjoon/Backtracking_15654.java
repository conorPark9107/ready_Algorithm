package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// N과 M (5) 
public class Backtracking_15654 {
	
	static int N;
	static int M;
	static int[] numbers;
	static int[] arr;
	static boolean[] used;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sArr = br.readLine().split(" ");
		N = Integer.parseInt(sArr[0]); // 1부터 N까지
		M = Integer.parseInt(sArr[1]); // 길이가 M인 수열
		arr = new int[M+1];
		numbers = new int[N];
		used = new boolean[N];
		
		sArr = br.readLine().split(" ");
		for(int i = 0; i < sArr.length; i++) {
			numbers[i] = Integer.parseInt(sArr[i]);
		}
		
		Arrays.sort(numbers);
		
		function(0);
		
		System.out.println(sb.toString());
	}
	
	private static void function(int len) {
		if(len == M) {
			for(int i = 0; i < M; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(!used[i]) {
				used[i] = true;
				arr[len] = numbers[i];
				function(len + 1);
				used[i] = false;
			}
			
			
			
		}
		
	}

}

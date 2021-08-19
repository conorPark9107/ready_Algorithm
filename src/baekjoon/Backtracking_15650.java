package baekjoon;

import java.util.Scanner;

// N과 M (2) 
public class Backtracking_15650 {
	
	static int N;
	static int M;
	static int[] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // 1부터 N까지
		M = sc.nextInt(); // 길이가 M인 수열
		
		arr = new int[M+1];
		function(1, 0);
	}

	private static void function(int now, int len) {
		if(len == M) {
			for(int i = 0 ; i < M; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = now; i <= N; i++) { 
			arr[len] = i;
			System.out.println(arr[len]);
			function(i + 1, len + 1);
		}
		
	}

}

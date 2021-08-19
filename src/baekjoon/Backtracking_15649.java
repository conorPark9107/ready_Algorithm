package baekjoon;

import java.util.Scanner;

// N과 M (1) 
public class Backtracking_15649 {
	
	static int N;
	static int M;
	static int[] arr;
	static boolean[] used;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // 1부터 N까지
		M = sc.nextInt(); // 길이가 M인 수열
		
		arr = new int[M+1];
		used = new boolean[N+1];
		function(0);
	}

	private static void function(int len) {
		if(len == M) {
			for(int i = 0 ; i < M; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 1; i <= N; i++) { 
			if(!used[i]) {
				arr[len] = i;
				used[i] = true;
				function(len + 1);
				used[i] = false;
			}
		}
		
	}

}

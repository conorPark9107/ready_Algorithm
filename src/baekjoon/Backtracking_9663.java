package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backtracking_9663 {

	static int N;
	static boolean[] used01; // 행 번호.
	static boolean[] used02; // 좌하우상
	static boolean[] used03; // 좌상우하
	static int count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		used01 = new boolean[N];
		used02 = new boolean[N * 2 - 1];
		used03 = new boolean[N * 2 - 1];
		
		function(0);
		
		System.out.println(count);
	}
	private static void function(int x) {
		if(x == N) {
			count++;
			return;
		}
		
		
		for(int y = 0; y < N; y++) {
			if(used01[y] || used02[x + y] || used03[x - y + N - 1]) continue;
			used01[y] = true;
			used02[x + y] = true;
			used03[x - y + N - 1] = true;
			function(x + 1);
			used01[y] = false;
			used02[x + y] = false;
			used03[x - y + N - 1] = false;
		}
	}

}

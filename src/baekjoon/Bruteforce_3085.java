package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 사탕 게임
public class Bruteforce_3085 {
	
	static int N;
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		String[][] arr = new String[N][N];
		
		for(int i = 0; i < N; i++) {
			String[] input = br.readLine().split("");
			arr[i]= input;
		}
		
		int max = 1;
		for(int i = 0; i < N; i++) {
			for(int j = 1; j < N; j++) {
				String[][] now = arr;
				int w = 1, h = 1;
				
				// 좌우
				now = swap(now, i, j, "width");
				w = search(now);
				now = swap(now, i, j, "width");
				
				// 상하
				now = swap(now, i, j, "height");
				h = search(now);
				now = swap(now, i, j, "height");
				
				int m = Math.max(w, h);
				max = Math.max(max, m);
			}
			
			if(max == N) break;
				
		}
		
		System.out.println(max);
		
		
	}

	private static int search(String[][] now) {
		int width = 1, height = 1;
		
		// 좌, 우
		for(int i = 0; i < N; i++) {
			int count = 1;
			for(int j = 1; j < N; j++) {
				if(now[i][j-1].equals(now[i][j])) {
					count++;
				}else {
					count = 1;
				}
				width = Math.max(width, count);
			}
		
			// 상, 하
			count = 1;
			for(int j = 1; j < N; j++) {
				if(now[j-1][i].equals(now[j][i])) {
					count++;
				}else {
					count = 1;
				}
				height = Math.max(height, count);
			}
		}
		
		return Math.max(width, height);
	}

	private static String[][] swap(String[][] now, int i, int j, String s) {
		String temp;
		
		if(s.equals("width")) { // 좌, 우
			temp = now[i][j-1];
			now[i][j-1] = now[i][j];
			now[i][j] = temp;
		}else { // 상, 하
			temp = now[j-1][i];
			now[j-1][i] = now[j][i];
			now[j][i] = temp;
		}
		
		return now;
	}

}

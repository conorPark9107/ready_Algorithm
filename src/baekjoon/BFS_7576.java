package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;


// 토마토 
// https://www.acmicpc.net/problem/7576
public class BFS_7576 {
	
	public static int[][] board;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(token.nextToken());
		int m = Integer.parseInt(token.nextToken());
		board = new int[m][n];
		
		ArrayDeque<int[]> queue = new ArrayDeque<>();
		
		for(int i = 0; i < m; i++) {
			token = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < n; j++) {
				
				board[i][j] = Integer.parseInt(token.nextToken());
				
				if(board[i][j] == 1) {
					queue.offer(new int[] {i, j});
				}
			}
		}
		
		// 상, 하, 좌, 우
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		while(!queue.isEmpty()) {
			
			int[] now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				
				int px = now[0] + dx[i];
				int py = now[1] + dy[i];
				
				if(px < 0 || px >= m || py < 0 || py >= n) continue;

				if(board[px][py] == 0) {
					board[px][py] = board[now[0]][now[1]] + 1;
					queue.offer(new int[] {px, py});
					
				}
				
			}
			
		}
		
		int max = 0;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(board[i][j] == 0) {
					max = -1;
					break;
				}
				max = Math.max(max, board[i][j]-1);
			}
			if(max == -1) {
				break;
			}
		}
		System.out.println(max);
		
	}

	

}

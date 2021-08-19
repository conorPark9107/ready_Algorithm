package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

// 불!
// https://www.acmicpc.net/problem/4179
public class BFS_4179 {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(token.nextToken());
		int C = Integer.parseInt(token.nextToken());
		char[][] board = new char[R][C];
		
		ArrayDeque<int[]> jQueue = new ArrayDeque<>();
		ArrayDeque<int[]> fQueue = new ArrayDeque<>();
		
		for(int i = 0; i < R; i++) {
			String str = br.readLine();
			
			for(int j = 0; j < C; j++) {
				board[i][j] = str.charAt(j);
				if(board[i][j] == 'F') {
					fQueue.offer(new int[] {i, j});
					
				}else if(board[i][j] == 'J') {
					jQueue.offer(new int[] {i, j});
				}
			}
		} // for
		
		
		// 상, 하, 좌, 우
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		int time = 1;
		
		while(!fQueue.isEmpty() || !jQueue.isEmpty()) {
			
			// 불
			int fSize = fQueue.size();
			for(int i = 0; i < fSize; i++) {
				int[] fNow = fQueue.poll();
				for(int j = 0; j < 4; j++) {
					int fx = fNow[0] + dx[j];
					int fy = fNow[1] + dy[j];
					
					if(fx < 0 || fx >= R || fy < 0 || fy >= C) continue;
					if(board[fx][fy] != 'F' && board[fx][fy] != '#') {
						board[fx][fy] = 'F';
						fQueue.offer(new int[] {fx, fy});
					}
					
				}
				
			}
			
			// 지훈
			int jSize = jQueue.size();
			for(int i = 0; i < jSize; i++) {
				int[] jNow = jQueue.poll();	
				if(jNow[0] == 0 || jNow[0] == R-1 || jNow[1] == 0 || jNow[1] == C-1) { 
					System.out.println(time);
					return;
				}
				
				for(int j = 0; j < 4; j++) {
					int jx = jNow[0] + dx[j];
					int jy = jNow[1] + dy[j];
					
					if(jx == 0 || jx == R-1 || jy == 0 || jy == C-1) {
						if(board[jx][jy] == '#' || board[jx][jy] == 'F') continue;
						
						System.out.println(time+1);
						return;
					}
					if(board[jx][jy] != 'J' && board[jx][jy] == '.') {
						board[jx][jy] = 'J';
						jQueue.offer(new int[] {jx, jy});
					}
				}
			}
			
			time++;
		}// while()
		
		if(time == 1) {
			System.out.println(time);
		}else {
			System.out.println("IMPOSSIBLE");
		}
		
		
	}

}


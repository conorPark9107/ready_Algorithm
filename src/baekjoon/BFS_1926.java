package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 그림
// https://www.acmicpc.net/problem/1926
public class BFS_1926 {

	public static int[][] board;
	public static boolean[][] check;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 행
		int m = sc.nextInt(); // 열
		
		board = new int[n][m];
		check = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		int count = 0; // 그림의 개수
		int max = 0;   // 가장 큰 그림의 넓이
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(!check[i][j] && board[i][j] == 1) {
					max = Math.max(max, bfs(i, j));
					count++;
				}
			}
		}
		
		System.out.println(count);
		System.out.println(max);
		
		
	}

	private static int bfs(int x, int y) {
		int[] dx = {-1, 1, 0, 0}; 
		int[] dy = {0, 0, -1, 1};
		int area = 0; // 그림의 넓이
		
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.offer(new int[] {x, y});
		check[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] position = queue.poll();
			area++;
			
			for(int i = 0; i < 4; i++) {
				int px = position[0] + dx[i];
				int py = position[1] + dy[i];
				
				// 배열의 범위를 벗어나는 경우.
				if(px < 0 || px >= check.length || py < 0 || py >= check[0].length) continue;
				// 방문 했거나, 방문할 수 없는 == 0인 경우.
				if(check[px][py] || board[px][py] != 1) continue;
				
				queue.offer(new int[] {px, py});
				check[px][py] = true;
				 
			}
			
		}
		
		return area;
	}

}

package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 미로 탐색
// https://www.acmicpc.net/problem/2178
public class BFS_2178 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		
		int[][] board = new int[n][m];
		for(int i = 0; i < n; i++) {
			String[] arr = sc.nextLine().split("");
			for(int j = 0; j < m; j++) {
				board[i][j] = Integer.parseInt(arr[j])-1;
			}
		}
		
		
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.offer(new int[] {0, 0});
		board[0][0] = 1;
		while(!queue.isEmpty()) {
			
			int[] position = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int px = position[0] + dx[i];
				int py = position[1] + dy[i];
				
				if(px < 0 || px >= n || py < 0 || py >= m) continue;
				if(board[px][py] != 0) continue;
				
				queue.offer(new int[] {px, py});
				board[px][py] = board[position[0]][position[1]]+1;
			}
			
		}

		System.out.println(board[n-1][m-1]);
	}

}

package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class DFS_1012 {
	
	static int[][] board;
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = p(br.readLine());	
		for(int i = 0; i < testCase; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			int N = p(token.nextToken());
			int M = p(token.nextToken());
			int quantity = p(token.nextToken());
			board = new int[M][N];
			visited = new boolean[M][N];			
			
			for(int j = 0; j < quantity; j++) {
				token = new StringTokenizer(br.readLine());
				int x = p(token.nextToken());
				int y = p(token.nextToken());
				board[y][x] = 1;
			}
			
			int count = 0;
			for(int m = 0; m < M; m++) {
				for(int n = 0; n < N; n++) {
					if(board[m][n] == 1 && !visited[m][n]) {
						dfs(m, n);
						count++;
					}
			
				}
			}
			System.out.println(count);
			
			
		}// end for
		

	}
	
	private static void dfs(int m, int n) {
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		Stack<int[]> stack = new Stack<>();
		stack.push(new int[] {m, n});
		while(!stack.isEmpty()) {
			
			int[] arr = stack.pop();
			
			for(int i = 0; i < 4; i++) {
				int px = arr[0] + dx[i];
				int py = arr[1] + dy[i];
				
				if(px < 0 || px >= board.length || py < 0 || py >= board[0].length) continue;
				
				if(board[px][py] == 1 && !visited[px][py]) {
					visited[px][py] = true;
					stack.push(new int[] {px, py});
				}
			}
			
		}
		
	}

	public static int p(String str) {
		return Integer.parseInt(str);
	}

}


package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFS_7562 {

	private static final int[] DX = {-1, -2, -2, -1, 1, 2, 2, 1};
	private static final int[] DY = {-2, -1, 1, 2, -2, -1, 1, 2};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		StringTokenizer token = null;
		
		for(int i = 0; i < testCase; i++) {
			
			// 한변의 길이 n, 체스판의 크기 n * n 배열 생성
			token = new StringTokenizer(br.readLine());
			int n = parse(token.nextToken()); 
			int[][] chessBoard = new int[n][n];
			
			// 현재 위치 
			token = new StringTokenizer(br.readLine());
			int[] startposition = {parse(token.nextToken()), parse(token.nextToken())};

			// 이동하려는 위치 X, Y
			token = new StringTokenizer(br.readLine());
			int targetX = parse(token.nextToken()); 
			int targetY = parse(token.nextToken()); 
			
			// BFS
			Queue<int[]> queue = new LinkedList<>();
			queue.offer(startposition);
			chessBoard[ startposition[0] ][ startposition[1] ] = 1;
			
			while(!queue.isEmpty()) {
				int[] nowPosition = queue.poll();
				
				// 이동하려는 위치일 경우.
				if(nowPosition[0] == targetX && nowPosition[1] == targetY) { 
					break;
				}
				
				// 나이트가 움직일 수 있는 모든 경우의 수 == 8
				for(int j = 0; j < 8; j++) { 
					
					int dx = nowPosition[0] + DX[j];
					int dy = nowPosition[1] + DY[j];
					
					if(dx < 0 || dx >= n || dy < 0 || dy >= n) continue;
					
					if(chessBoard[dx][dy] == 0) {
						chessBoard[dx][dy] = chessBoard[nowPosition[0]][nowPosition[1]] + 1;
						queue.offer(new int[]{dx, dy});
					}
				}
				
			}// while
			
			System.out.println(chessBoard[targetX][targetY]-1);
		}
	}
	
	public static int parse(String s) {
		return Integer.parseInt(s);
	}

}

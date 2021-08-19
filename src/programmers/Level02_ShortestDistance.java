package programmers;

import java.util.ArrayDeque;

public class Level02_ShortestDistance {

	public static void main(String[] args) {
		int answer = solution(new int[][] { {1,0,1,1,1},
											{1,0,1,0,1},
											{1,0,1,1,1},
											{1,1,1,0,1},
											{0,0,0,0,1}});
		System.out.println(answer); // answer = 11
		
		
		answer = solution(new int[][] {{1,0,1,1,1},
									   {1,0,1,0,1},
									   {1,0,1,1,1},
									   {1,1,1,0,0},
									   {0,0,0,0,1}});
		System.out.println(answer); // answer = -1	

	}

	public static int solution(int[][] maps) {

		// n과 m은 둘다 1일 수 없고, 1 ~ 100범위 내로 주어짐.
		int n = maps.length;
		int m = maps[0].length;
		
		// 상 하 좌 우
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		// 방문 체크 해주기 위해 visited 배열 생성.
		boolean[][] visited = getVisitedArr(maps, n, m);
		
		
		// 시작점 0, 0을 큐에 삽입, 시작점을 방문처리.
		ArrayDeque<int[]> queue = new ArrayDeque<>();
		queue.offer(new int[] {0, 0});
		visited[0][0] = true;
		
		// BFS
		while(!queue.isEmpty()) 
		{
			// 현재 위치
			int[] nowPosition = queue.poll();
			
			// 반복문은 상, 하, 좌, 우 == 4번
			for(int i = 0; i < 4; i++) 
			{
				// 현재 위치 == 행, 열
				int x = nowPosition[0];
				int y = nowPosition[1];
				
				// 현재 위치에서 동, 서, 남, 북으로 이동 했을 경우에 행과 열,
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				// 배열의 범위를 벗어난 경우 == 맵을 벗어난 경우.
				if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
				
				//  1 == 길 && 방문한 적이 없는 길
				if(maps[nx][ny] == 1 && !visited[nx][ny]) {
					visited[nx][ny] = true; 		 // 이동한 위치를 방문처리
					maps[nx][ny] = maps[x][y] + 1;   // 현재위치 + 1
					queue.offer(new int[] {nx, ny}); // BFS해주기 위해 queue에 이동한 위치를 넣어줌.
				}
			}
		}
		// 마지막 리턴하기전 상대지점의 값이 1인경우 == 벽으로 막혀있어서 방문하지 못했을 경우에 값이 1이다.
		return maps[n-1][m-1] == 1? -1 : maps[n-1][m-1];
	}
	
	// visited배열을 생성해 주기 위해 벽(0)인 경우에는 방문하면 안되기 때문에 true로, 길(1)인 경우에는 false로 초기화
	private static boolean[][] getVisitedArr(int[][] maps, int n, int m) {
		boolean[][] visited = new boolean[n][m];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++) 
			{
				// 벽 == 0인경우에는 방문하면 안되기 때문에 방문처리로 해버림.
				visited[i][j] = maps[i][j] == 0 ? true : false;
			}
		}
		return visited;
	}
}

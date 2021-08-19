package programmers;

// 방문 길이
public class Level02_VsitedLength {

	public static void main(String[] args) {
		int answer = solution("ULURRDLLU");
		System.out.println(answer);

		answer = solution("LULLLLLLU");
		System.out.println(answer);
	}

	public static int solution(String dirs) {
		
		int[] dx = { -1, 1, 0, 0 }; // 상하좌우
		int[] dy = { 0, 0, -1, 1 };
		int[] unit = { 5, 5 };
		boolean[][][][] visited = new boolean[11][11][11][11];
		int answer = 0; 
		
		for (int i = 0; i < dirs.length(); i++) {
			char command = dirs.charAt(i);
			int x = unit[0];
			int y = unit[1];
			int nx = x;
			int ny = y;
			
			switch (command) {
			case 'U':
				nx += dx[0];
				ny += dy[0];
				break;

			case 'D':
				nx += dx[1];
				ny += dy[1];
				break;

			case 'L':
				nx += dx[2];
				ny += dy[2];
				break;

			case 'R':
				nx += dx[3];
				ny += dy[3];
				break;
			}
			
			
			// 좌표평면을 넘어섰을 경우.
			if(nx < 0 || nx > 10 || ny < 0 || ny > 10) continue;
			
			unit[0] = nx;
			unit[1] = ny;
			if(!visited[x][y][nx][ny] || !visited[nx][ny][x][y]) {
				visited[x][y][nx][ny] = true;
				visited[nx][ny][x][y] = true;
				answer++;
			}
			
		}// end for

		return answer;
	}

}

package programmers;

import java.util.ArrayDeque;

// 리코쳇 로봇
// https://school.programmers.co.kr/learn/courses/30/lessons/169199
public class Level02_리코쳇_로봇 {

    public static void main(String[] args) {
        Level02_리코쳇_로봇 o = new Level02_리코쳇_로봇();
        System.out.println(o.solution(new String[]{"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."})); // 7
        System.out.println(o.solution(new String[]{".D.R", "....", ".G..", "...D"})); // -1
        System.out.println(o.solution(new String[]{"R.G"})); // 1
        System.out.println(o.solution(new String[]{"R..G"})); // 1
        System.out.println(o.solution(new String[]{"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."})); // 7

    }

    public int solution(String[] board) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int n = board.length;
        int m = board[0].length();
        ArrayDeque<int[]> q = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][m];
        char[][] maps = new char[n][m];
        int[] start = new int[2];
        int[] end = new int[2];

        for (int i = 0; i < board.length; i++) {
            String s = board[i];
            for (int j = 0; j < board[i].length(); j++) {
                char c = s.charAt(j);
                maps[i][j] = c;
                if (c == 'R') {
                    start = new int[]{i, j, 0};
                } else if (c == 'G') {
                    end = new int[]{i, j};
                }
            }
        }

        q.offer(start);
        visited[start[0]][start[1]] = true;
        
        while (!q.isEmpty()) {
            int[] arr = q.poll();
            int x = arr[0];
            int y = arr[1];
            int dist = arr[2];

            if (maps[x][y] == 'G') {
                return dist;
            }

            for (int i = 0; i < 4; i++) {
                int cx = x + dx[i];
                int cy = y + dy[i];

                while (true) {
                    if (isWall(cx, cy, n, m) || maps[cx][cy] == 'D') break;
                    cx = cx + dx[i];
                    cy = cy + dy[i];
                }
                cx = cx - dx[i];
                cy = cy - dy[i];

                if (!visited[cx][cy]) {
                    visited[cx][cy] = true;
                    q.offer(new int[]{cx, cy, dist + 1});
                }
            }
        }
        return -1;
    }

    private boolean isWall(int cx, int cy, int n, int m) {
        return cx < 0 || cx >= n || cy < 0 || cy >= m;
    }

}



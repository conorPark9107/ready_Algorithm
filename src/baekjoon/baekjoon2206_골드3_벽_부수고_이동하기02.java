package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class baekjoon2206_골드3_벽_부수고_이동하기02 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            char[] arr = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                map[i][j] = arr[j] - '0';
            }
        }

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        boolean[][][] visited = new boolean[n][m][2]; // 벽을 안뚫고 왔다. 0 , 벽을 뚫고 왔다. 1
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0, 0, 0, 1});
        visited[0][0][0] = true;

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];
            int b = curr[2]; // 전에 벽을 뚫은적이 있는지.
            int d = curr[3]; // 거리

            if (x == n - 1 && y == m - 1) {
                System.out.println(d);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (map[nx][ny] == 0) {
                    if (!visited[nx][ny][b]) {
                        visited[nx][ny][0] = true;
                        q.offer(new int[]{nx, ny, b, d + 1});
                    }
                } else {
                    // 1일경우.
                    if (!visited[nx][ny][1] && b == 0) {
                        visited[nx][ny][1] = true;
                        q.offer(new int[]{nx, ny, 1, d + 1});
                    }
                }
            }
        }

        System.out.println(-1);

    }


}

package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon14502_골드4_연구소02 {

    static int answer, n, m;
    static List<int[]> viruses = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int input = Integer.parseInt(st.nextToken());
                map[i][j] = input;
                if (input == 2) {
                    viruses.add(new int[]{i, j});
                }
            }
        }

        dfs(0, 0, map);
        System.out.println(answer);
    }

    private static void dfs(int depth, int s, int[][] map) {
        if (depth == 3) {
            // 바이러스 전파.
            int[][] spreadVirusMap = getSpreadVirusMap(map);

            // 빈칸 확인.
            answer = Math.max(answer, getCount(spreadVirusMap));

            return;
        }
        for (int i = s; i < (n * m); i++) {
            int x = i / m;
            int y = i % m;
            if (map[x][y] == 0) {
                map[x][y] = 1;
                dfs(depth + 1, i + 1, map);
                map[x][y] = 0;
            }
        }
    }

    private static int[][] getSpreadVirusMap(int[][] map) {
        int[][] copy = new int[n][m];
        for (int i = 0; i < n; i++) {
            System.arraycopy(map[i], 0, copy[i], 0, m);
        }

        ArrayDeque<int[]> q = new ArrayDeque<>(viruses);
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            int[] arr = q.poll();
            int x = arr[0];
            int y = arr[1];
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (copy[nx][ny] == 0) {
                    copy[nx][ny] = 2;
                    q.offer(new int[]{nx, ny});
                }
            }
        }
        return copy;
    }

    private static int getCount(int[][] spread) {
        int count = 0;
        for (int[] line : spread) {
            for (int col : line) {
                if (col == 0) count++;
            }
        }
        return count;
    }
}

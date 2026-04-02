package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 연구소
// https://www.acmicpc.net/problem/14502
public class Baekjoon14502_골드4_연구소 {

    static int n;
    static int m;
    static int answer;
    static ArrayList<int[]> virus = new ArrayList<>();

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
                if (input == 2) {
                    virus.add(new int[]{i, j});
                }
                map[i][j] = input;
            }
        }

        dfs(0, 0, map);
        System.out.println(answer);
    }

    // 벽 3개 세우기
    private static void dfs(int depth, int start, int[][] map) {
        if (depth == 3) {
            // 배열 복사.
            int[][] copyed = new int[n][m];
            for (int i = 0; i < n; i++) {
                System.arraycopy(map[i], 0, copyed[i], 0, m);
            }

            int[][] flatMap = spreadVirusBfs(copyed); // 바이러스 펼치기
            answer = Math.max(answer, getSafeArea(flatMap)); // 안전영역 카운트.
            return;
        }

        for (int i = start; i < n * m; i++) {
            int x = i / m;
            int y = i % m;
            if (map[x][y] == 0) {
                map[x][y] = 1;
                dfs(depth + 1, i + 1, map);
                map[x][y] = 0;
            }
        }
    }

    private static int[][] spreadVirusBfs(int[][] copied) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        ArrayDeque<int[]> dq = new ArrayDeque<>();

        for (int[] v : virus) {
            dq.offer(new int[]{v[0], v[1]});
        }

        while (!dq.isEmpty()) {
            int[] arr = dq.poll();
            int x = arr[0];
            int y = arr[1];
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (copied[nx][ny] == 0) {
                    copied[nx][ny] = 2;
                    dq.offer(new int[]{nx, ny});
                }
            }
        }
        return copied;
    }

    private static int getSafeArea(int[][] flatMap) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (flatMap[i][j] == 0) count++;
            }
        }
        return count;
    }


}

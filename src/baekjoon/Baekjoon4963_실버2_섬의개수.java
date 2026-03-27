package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

// 섬의 개수
// https://www.acmicpc.net/problem/4963
public class Baekjoon4963_실버2_섬의개수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;

        // 상, 하, 좌, 우, 좌상, 좌하, 우상, 우하
        int[] dx = {-1, 1, 0, 0, -1, 1, -1, 1};
        int[] dy = {0, 0, -1, 1, -1, -1, 1, 1};

        StringBuilder sb = new StringBuilder();

        while (true) {
            token = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(token.nextToken());
            int h = Integer.parseInt(token.nextToken());
            if (w == 0 && h == 0) break;

            int[][] map = new int[h][w];
            for (int i = 0; i < h; i++) {
                token = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(token.nextToken());
                }
            }

            ArrayDeque<int[]> q = new ArrayDeque<>();
            int islands = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == 1) {
                        islands++;
                        map[i][j] = 2;
                        q.offer(new int[]{i, j});
                        while (!q.isEmpty()) {
                            int[] arr = q.poll();
                            int x = arr[0];
                            int y = arr[1];
                            for (int k = 0; k < 8; k++) {
                                int mx = x + dx[k];
                                int my = y + dy[k];
                                if (mx < 0 || mx >= h || my < 0 || my >= w) continue;
                                if (map[mx][my] == 1) {
                                    q.offer(new int[]{mx, my});
                                    map[mx][my] = 2;
                                }
                            }
                        }
                    }
                }
            }
            sb.append(islands).append("\n");
        }
        System.out.println(sb);
    }


}


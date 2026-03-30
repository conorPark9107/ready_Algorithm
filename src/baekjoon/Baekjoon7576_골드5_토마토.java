package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

// 토마토
// https://www.acmicpc.net/problem/7576
public class Baekjoon7576_골드5_토마토 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        ArrayDeque<int[]> q = new ArrayDeque<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                int input = Integer.parseInt(st.nextToken());
                arr[i][j] = input;
                if (input == 1) {
                    q.offer(new int[]{i, j});
                } else if (input == 0) {
                    count++;
                }
            }
        }

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int day = -1;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                int x = curr[0];
                int y = curr[1];

                for (int j = 0; j < 4; j++) {
                    int mx = x + dx[j];
                    int my = y + dy[j];
                    if (mx < 0 || mx >= n || my < 0 || my >= m) continue;
                    if (arr[mx][my] == 0) {
                        count--;
                        q.offer(new int[]{mx, my});
                        arr[mx][my] = 1;
                    }
                }
            }
            day = day + 1;
        }
        if (count > 0) day = -1;
        System.out.println(day);
    }

    private static void print(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.printf("%3d", anInt);
            }
            System.out.println();
        }

    }
}

package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 단지 번호 붙이기
// https://www.acmicpc.net/problem/2667
public class Baekjoon2667_실버1_단지번호붙이기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            char[] arr = br.readLine().toCharArray();
            for (int j = 0; j < n; j++) {
                map[i][j] = arr[j] - '0';
            }
        }
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        List<Integer> houses = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] != 1) continue;

                ArrayDeque<int[]> q = new ArrayDeque<>();
                q.offer(new int[]{i, j});
                map[i][j] = 0;
                int cnt = 1;

                while (!q.isEmpty()) {
                    int[] arr = q.poll();
                    int x = arr[0];
                    int y = arr[1];

                    for (int k = 0; k < 4; k++) {
                        int cx = x + dx[k];
                        int cy = y + dy[k];
                        if (cx < 0 || cx >= n || cy < 0 || cy >= n) continue;
                        if (map[cx][cy] == 1) {
                            map[cx][cy] = 0;
                            q.offer(new int[]{cx, cy});
                            cnt++;
                        }
                    }
                }
                houses.add(cnt);
            }
        }

        System.out.println(houses.size());
        Collections.sort(houses);
        houses.forEach(System.out::println);
    }


}

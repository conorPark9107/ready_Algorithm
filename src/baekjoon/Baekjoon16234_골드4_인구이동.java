package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 인구 이동
// https://www.acmicpc.net/problem/16234
public class Baekjoon16234_골드4_인구이동 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int day = 0;
        int[][] dire = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int[][] map = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(arr[j]);
            }
        }

        while (true) {
            boolean[][] visited = new boolean[n][n];
            boolean moved = false;
            List<List<int[]>> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (visited[i][j]) continue;
                    List<int[]> allyList = new ArrayList<>();

                    ArrayDeque<int[]> q = new ArrayDeque<>();
                    int[] forAdd = {i, j};

                    q.add(forAdd);
                    allyList.add(forAdd);

                    while (!q.isEmpty()) {
                        int[] arr = q.poll();
                        int x = arr[0];
                        int y = arr[1];

                        visited[x][y] = true;

                        int length = map.length - 1;
                        for (int k = 0; k < 4; k++) {
                            int dx = x + dire[k][0];
                            int dy = y + dire[k][1];

                            if (dx < 0 || dx > length || dy < 0 || dy > length) continue;

                            int v = Math.abs(map[x][y] - map[dx][dy]);
                            if (v >= l && v <= r) {
                                if (visited[dx][dy]) continue;
                                visited[dx][dy] = true;
                                int[] forAdd2 = new int[]{dx, dy};
                                q.add(forAdd2);
                                allyList.add(forAdd2);
                            }
                        }
                    }

                    if (allyList.size() > 1) { // 이동이 일어남.
                        list.add(allyList);
                        moved = true;
                    }
                }
            }

            for (List<int[]> unions : list) {
                int sum = 0;
                for (int[] union : unions) {
                    int aI = union[0];
                    int aJ = union[1];
                    sum += map[aI][aJ];
                }
                int avg = sum / unions.size();
                for (int[] union : unions) {
                    int aI = union[0];
                    int aJ = union[1];
                    map[aI][aJ] = avg;
                }
            }

            if (!moved) break;
            day++;
        }
        System.out.println(day);
    }


}

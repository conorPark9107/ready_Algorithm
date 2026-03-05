package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 로봇청소기
// https://www.acmicpc.net/problem/14503
public class Baekjoon14503_골드5_로봇청소기02 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(reader.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        boolean[][] isCleaned = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String[] s = reader.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(s[j]);
                isCleaned[i][j] = map[i][j] == 1;
            }
        }

        int answer = 0;
        int[] br = {1, 0, -1, 0};
        int[] bc = {0, -1, 0, 1};
        int[] mr = {-1, 0, 1, 0};
        int[] mc = {0, 1, 0, -1};

        while (true) {
            if (!isCleaned[r][c]) {
                isCleaned[r][c] = true;
                answer++;
            }

            boolean hasEmptySpace = false;
            for (int i = 0; i < 4; i++) {
                int cr = r + mr[i];
                int cc = c + mc[i];
                if (!isCleaned[cr][cc] && map[cr][cc] == 0) {
                    hasEmptySpace = true;
                    break;
                }
            }

            if (!hasEmptySpace) {
                int cr = r + br[d];
                int cc = c + bc[d];
                if (map[cr][cc] == 1) break;
                r = cr;
                c = cc;
            } else {
                for (int i = 1; i <= 4; i++) {
                    d = (d + 3) % 4;
                    int cr = r + mr[d];
                    int cc = c + mc[d];
                    if (!isCleaned[cr][cc] && map[cr][cc] == 0) {
                        r = cr;
                        c = cc;
                        break;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}

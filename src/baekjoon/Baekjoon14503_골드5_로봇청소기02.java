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
        int r = Integer.parseInt(st.nextToken()); // 시작 위치 row
        int c = Integer.parseInt(st.nextToken()); // 시작 위치 col
        int d = Integer.parseInt(st.nextToken()); // 처음 보고있는 방향 0 = 북, 1 = 동, 2 = 남, 3 = 서

        // 0 인경우 빈칸, 1인경우 벽
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
        // 남서북동
        int[] br = {1, 0, -1, 0};
        int[] bc = {0, -1, 0, 1};
        // 북동남서
        int[] mr = {-1, 0, 1, 0};
        int[] mc = {0, 1, 0, -1};

        while (true) {
            // 1. 현재 칸이 아직 청소되지 않은 경우, 현재 칸을 청소한다.
            if (!isCleaned[r][c]) {
                isCleaned[r][c] = true;
                answer++;
            }

            boolean hasEmptySpace = false;
            for (int i = 0; i < 4; i++) {
                int cr = r + mr[i];
                int cc = c + mc[i];
                if (!isOver(cr, cc, n, m) && !isCleaned[cr][cc] && map[cr][cc] == 0) {
                    hasEmptySpace = true;
                    break;
                }
            }

            if (!hasEmptySpace) {
                // 2. 현재 칸의 주변 4칸 중 청소되지 않은 빈 칸이 없는 경우
                int cr = r + br[d];
                int cc = c + bc[d];

                // 2-2. 바라보는 방향의 뒤쪽 칸이 벽이라 후진할 수 없다면 작동을 멈춘다.
                if (isOver(cr, cc, n, m) || map[cr][cc] == 1) break;

                // 2-1. 바라보는 방향을 유지한 채로 한 칸 후진할 수 있다면 한 칸 후진하고 1번으로 돌아간다.
                r = cr;
                c = cc;


            } else {
                // 3. 현재 칸의 주변 4칸 중 청소되지 않은 빈 칸이 있는 경우
                // 3-1. 반시계 방향으로 90도 회전한다.
                for (int i = 1; i <= 4; i++) {
                    d = (d + 3) % 4;
                    int cr = r + mr[d];
                    int cc = c + mc[d];
                    // 3-2. 바라보는 방향을 기준으로 앞쪽 칸이 청소되지 않은 빈 칸인 경우 한 칸 전진한다.
                    if (!isOver(cr, cc, n, m) && !isCleaned[cr][cc] && map[cr][cc] == 0) {
                        r = cr;
                        c = cc;
                        break;
                    }
                }
            }
        }

        System.out.println(answer);
    }

    private static boolean isOver(int nr, int nc, int n, int m) {
        return nr < 0 || nr >= n || nc < 0 || nc >= m;
    }

}

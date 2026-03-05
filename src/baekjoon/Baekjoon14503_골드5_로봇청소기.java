package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

// 로봇청소기
// https://www.acmicpc.net/problem/14503
public class Baekjoon14503_골드5_로봇청소기 {

    public static void main(String[] args) throws IOException {
        System.out.println();
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
        int[] br = {1, 0, -1, 0};
        int[] bc = {0, -1, 0, 1};

        int[] mr = {-1, 0, 1, 0};
        int[] mc = {0, 1, 0, -1};
        ArrayDeque<int[]> stack = new ArrayDeque<>();

        stack.push(new int[]{r, c, d});

        while (!stack.isEmpty()) {
            int[] pop = stack.pop();
            int row = pop[0];
            int col = pop[1];
            int dire = pop[2];

            // 1. 현재 칸이 아직 청소되지 않은 경우, 현재 칸을 청소한다.
            if (!isCleaned[row][col] && map[row][col] == 0) {
                answer++;
                isCleaned[row][col] = true;
            }

            boolean hasEmpty = false;
            for (int i = 0; i < 4; i++) {
                int nr = row + mr[i];
                int nc = col + mc[i];

                if (isOver(nr, nc, n, m)) continue;
                if (map[nr][nc] == 0 && !isCleaned[nr][nc]) {
                    hasEmpty = true;
                    break;
                }
            }

            // 2. 현재 칸의 4칸 중 청소되지 않은 빈 칸이 없는 경우.
            if (!hasEmpty) {
                int nr = row + br[dire];
                int nc = col + bc[dire];
                if (isOver(nr, nc, n, m)) break;

                // 2-1. 바라보는 방향을 유지한 채로 한 칸 후진할 수 있다면 한 칸 후진하고 1번으로 돌아간다.
                if (map[nr][nc] == 0) {
                    stack.push(new int[]{nr, nc, dire});

                } else {
                    // 2-2) 바라보는 방향의 뒤쪽 칸이 벽이라 후진할 수 없다면 작동을 멈춘다.
                    break;
                }

            } else {
                // 3. 현재 칸의 4칸 중 청소되지 않은 빈 칸이 있는 경우.
                // 3-1. 반시계 방향으로 90도 회전한다.
                for (int i = 1; i <= 4; i++) {
                    dire = (dire + 3) % 4;
                    int nr = row + mr[dire];
                    int nc = col + mc[dire];

                    // 3-2. 바라보는 방향을 기준으로 앞쪽 칸이 청소되지 않은 빈 칸인 경우 한 칸 전진한다.
                    if (!isOver(nr, nc, n, m)
                            && map[nr][nc] == 0
                            && !isCleaned[nr][nc]) {
                        // 3-3. 1번으로 돌아간다. (스택에 push 함으로 반복문이 종료되지 않음.)
                        stack.push(new int[]{nr, nc, dire});
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

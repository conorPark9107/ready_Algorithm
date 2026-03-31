package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 뱀
// https://www.acmicpc.net/problem/3190
public class Baekjoon3190_골드4_뱀 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        // 사과 1, 뱀 2
        int[][] board = new int[n][n];
        StringTokenizer st;
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            board[x][y] = 1;
        }

        // 우 하 좌 상
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};


        Map<Integer, Character> direMap = new HashMap<>();
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);
            direMap.put(t, c);
        }

        ArrayDeque<int[]> snakeDq = new ArrayDeque<>();
        snakeDq.offer(new int[]{0, 0});
        board[0][0] = 2;

        int dir = 0;
        int time = 0;

        while (true) {
            time++;

            int[] head = snakeDq.peekFirst();
            int nx = head[0] + dx[dir];
            int ny = head[1] + dy[dir];

            // 종료조건 : 벽
            if (nx < 0 || ny < 0 || nx >= n || ny >= n) break;

            // 종료조건 : 몸
            if (board[nx][ny] == 2) break;

            // 이동
            if (board[nx][ny] == 1) { // 사과 있음
                board[nx][ny] = 2;
                snakeDq.addFirst(new int[]{nx, ny});
            } else { // 사과 없음
                board[nx][ny] = 2;
                snakeDq.addFirst(new int[]{nx, ny});
                int[] tail = snakeDq.pollLast();
                board[tail[0]][tail[1]] = 0;
            }

            if (direMap.containsKey(time)) {
                char c = direMap.get(time);

                if (c == 'L') {
                    dir = (dir + 3) % 4;
                } else {
                    dir = (dir + 1) % 4;
                }
            }
        }

        System.out.println(time);
    }

    public static void print(int[][] board) {
        for (int[] ints : board) {
            for (int anInt : ints) {
                System.out.printf("%2d", anInt);
            }
            System.out.println();
        }
    }


}

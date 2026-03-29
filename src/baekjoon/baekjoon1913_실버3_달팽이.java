package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 달팽이
// https://www.acmicpc.net/problem/1913
public class baekjoon1913_실버3_달팽이 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int target = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];

        // 하 우 상 좌
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        int max = n * n;
        int end = n / 2;
        int x = 0;
        int y = 0;
        arr[x][y] = max;
        
        while (arr[end][end] == 0) {
            for (int i = 0; i < 4; i++) {
                while (true) {
                    int mx = x + dx[i];
                    int my = y + dy[i];
                    if (mx < 0 || mx >= n || my < 0 || my >= n || arr[mx][my] > 0) break;
                    arr[mx][my] = arr[x][y] - 1;
                    x = mx;
                    y = my;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] == target) {
                    x = i;
                    y = j;
                }
            }
            System.out.println();
        }
        System.out.println((x + 1) + " " + (y + 1));
    }

}

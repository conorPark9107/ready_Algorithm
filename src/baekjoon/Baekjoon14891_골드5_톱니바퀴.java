package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 톱니바퀴
// https://www.acmicpc.net/problem/14891
public class Baekjoon14891_골드5_톱니바퀴 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 0 == N, 1 == S
        char[][] cogwheels = {
                br.readLine().toCharArray(),
                br.readLine().toCharArray(),
                br.readLine().toCharArray(),
                br.readLine().toCharArray()
        };


        int k = Integer.parseInt(br.readLine()); // 회전 횟수.
        for (int i = 0; i < k; i++) {
            String[] arr = br.readLine().split(" ");
            int index = Integer.parseInt(arr[0]) - 1; // 톱니바퀴
            int dire = Integer.parseInt(arr[1]); // 방향 1일경우 시계방향 아닐경우 반시계방향.

            int[] dir = new int[4];
            dir[index] = dire;

            // right 판별
            for (int j = index; j < 3; j++) {
                if (cogwheels[j][2] != cogwheels[j + 1][6]) {
                    dir[j + 1] = -dir[j];
                } else {
                    break;
                }
            }

            // left 판별
            for (int j = index; j > 0; j--) {
                if (cogwheels[j][6] != cogwheels[j - 1][2]) {
                    dir[j - 1] = -dir[j];
                } else {
                    break;
                }
            }
            for (int j = 0; j < 4; j++) {
                if (dir[j] != 0) {
                    rotate(cogwheels, j, dir[j]);
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < cogwheels.length; i++) {
            char c = cogwheels[i][0];
            ans += (c == '1') ? 1 << i : 0;
        }
        System.out.println(ans);
    }

    private static void rotate(char[][] cogwheels, int index, int dire) {
        char[] cogWheel = cogwheels[index];
        char temp = ' ';
        if (dire == 1) {
            temp = cogWheel[7];
            for (int i = 7; i > 0; i--) {
                cogWheel[i] = cogWheel[i - 1];
            }
            cogWheel[0] = temp;
        } else {
            temp = cogWheel[0];
            for (int i = 0; i < 7; i++) {
                cogWheel[i] = cogWheel[i + 1];
            }
            cogWheel[7] = temp;
        }
    }
}

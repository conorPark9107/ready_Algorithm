package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 컨베이어 벨트 위의 로봇
// https://www.acmicpc.net/problem/20055
public class Baekjoon20055_골드5_컨베이어_벨트_위의_로봇 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


        st = new StringTokenizer(br.readLine());
        int[] belt = new int[n * 2];
        boolean[] robot = new boolean[n];
        for (int i = 0; i < n * 2; i++) {
            belt[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        int count = 0;
        while (true) {
            // 1. 벨트 회전.
            rotateBelt(belt, robot);
            robot[n - 1] = false; // 내리는 위치의 로봇을 내림.

            // 2. 로봇 이동.
            count += rotateRobot(belt, robot);
            robot[n - 1] = false; // 내리는 위치의 로봇을 내림.

            // 3. 로봇 올리기.
            if (belt[0] >= 1) {
                robot[0] = true;
                belt[0]--;
                if (belt[0] == 0) count++;
            }

            // 4. 내구도가 0칸인 개수가 K개 이상이라면 과정을 종료.
            answer++;
            if (count >= k) break;
        }

        System.out.println(answer);
    }

    private static void rotateBelt(int[] belt, boolean[] robot) {
        int temp = belt[belt.length - 1];
        for (int i = belt.length - 1; i > 0; i--) {
            belt[i] = belt[i - 1];
        }
        belt[0] = temp;

        for (int i = robot.length - 1; i > 0; i--) {
            robot[i] = robot[i - 1];
        }
        robot[0] = false;
    }

    private static int rotateRobot(int[] belt, boolean[] robot) {
        int count = 0;
        for (int i = robot.length - 1; i > 0; i--) {
            if (robot[i - 1]) {
                if (!robot[i] && belt[i] >= 1) { // 로봇이 없으며, 그 칸의 내구도가 1이상 남아있음.
                    robot[i - 1] = false;
                    robot[i] = true;
                    belt[i]--;
                    if (belt[i] == 0) count++;
                }
            }
        }
        return count;
    }


}

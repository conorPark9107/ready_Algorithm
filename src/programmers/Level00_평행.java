package programmers;

import java.util.Arrays;
import java.util.Collections;

public class Level00_평행 {

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}})); // 1
        System.out.println(solution(new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}})); // 0
        System.out.println(solution(new int[][]{{1, 9}, {4, 1}, {1, 1}, {4, 9}})); // 1
    }

    public static int solution(int[][] dots) {
        int answer = 0;
        if(isParallel(dots[0], dots[1], dots[2], dots[3])) return 1;
        if(isParallel(dots[0], dots[2], dots[1], dots[3])) return 1;
        if(isParallel(dots[0], dots[3], dots[1], dots[2])) return 1;
        return answer;
    }

    private static boolean isParallel(int[] dot1, int[] dot2, int[] dot3, int[] dot4) {
        int dx1 = dot1[0] - dot2[0];
        int dy1 = dot1[1] - dot2[1];
        int dx2 = dot3[0] - dot4[0];
        int dy2 = dot3[1] - dot4[1];
        return dy1 * dx2 == dy2 * dx1;
    }

    // 틀린 문제
    public static int solution01(int[][] dots) {
        int answer = 0;

        Arrays.sort(dots,
                (o1, o2) -> o1[0] == o2[0]
                        ? o1[1] - o2[1]
                        : o1[0] - o2[0]);

        if(dots[1][0] - dots[0][0] == dots[3][0] - dots[2][0]
        && dots[3][1] - dots[1][1] == dots[2][1] - dots[0][1])
        {
            answer = 1;
        }

        return answer;
    }

}

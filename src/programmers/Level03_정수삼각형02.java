package programmers;

// 정수삼각형
// https://school.programmers.co.kr/learn/courses/30/lessons/43105?language=java
public class Level03_정수삼각형02 {

    public static void main(String[] args) {
        Level03_정수삼각형02 o = new Level03_정수삼각형02();
        System.out.println(o.solution(new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}})); // 30
        System.out.println(
                o.solution(
                        new int[][]{
                                {1},
                                {2, 3}
                        }
                )
        ); // 4
        System.out.println(
                o.solution(
                        new int[][]{
                                {2},
                                {-1, 3},
                                {4, -2, 1}
                        }
                )
        ); // 6
        System.out.println(
                o.solution(
                        new int[][]{
                                {5},
                                {9, 1},
                                {1, 1, 20}
                        }
                )
        ); // 26
        System.out.println(
                o.solution(
                        new int[][]{
                                {1},
                                {2, 100},
                                {100, 1, 1},
                                {1, 1, 1, 100}
                        }
                )
        ); // 202
    }

    public int solution(int[][] triangle) {
        int answer = 0;
        int l = triangle.length;
        int[][] dp = new int[l][l];
        dp[0][0] = triangle[0][0];

        for (int i = 1; i < l; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j];
                } else if (j == triangle[i - 1].length - 1) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];
                }
            }
        }

        for (int num : dp[l - 1]) {
            answer = Math.max(answer, num);
        }
        return answer;
    }
}

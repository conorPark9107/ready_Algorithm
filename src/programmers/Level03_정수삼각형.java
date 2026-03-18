package programmers;

// 정수 삼각형
// https://school.programmers.co.kr/learn/courses/30/lessons/43105
public class Level03_정수삼각형 {

    public static void main(String[] args) {
        Level03_정수삼각형 o = new Level03_정수삼각형();
        System.out.println(o.solution(new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}}));
    }


    public int solution(int[][] triangle) {
        int len = triangle.length;
        int[][] dp = new int[len][len];
        dp[0][0] = triangle[0][0];

        for (int i = 1; i < len; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (j == 0) {
                    dp[i][j] += dp[i - 1][j] + triangle[i][j];
                } else if (j == triangle[i].length - 1) {
                    dp[i][j] += dp[i - 1][j - 1] + triangle[i][j];
                } else {
                    dp[i][j] += Math.max(
                            dp[i - 1][j],
                            dp[i - 1][j - 1]
                    ) + triangle[i][j];
                }
            }
        }

        int answer = 0;
        for (int val : dp[len - 1]) {
            answer = Math.max(answer, val);
        }

        return answer;
    }


    public int solution02(int[][] triangle) {
        int length = triangle.length;
        int answer = 0;

        for (int i = 1; i < length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {

                int a = (j - 1 >= 0) ? triangle[i - 1][j - 1] : 0;
                int b = (j < triangle[i - 1].length) ? triangle[i - 1][j] : 0;

                triangle[i][j] += Math.max(a, b);
            }
        }

        for (int val : triangle[length - 1]) {
            answer = Math.max(answer, val);
        }

        return answer;
    }

}

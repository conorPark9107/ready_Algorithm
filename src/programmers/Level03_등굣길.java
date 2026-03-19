package programmers;

// 등굣길
// https://school.programmers.co.kr/learn/courses/30/lessons/42898
public class Level03_등굣길 {

    public static void main(String[] args) {
        Level03_등굣길 o = new Level03_등굣길();
        System.out.println(o.solution(4, 3, new int[][]{{2, 2}})); // 4
        System.out.println(o.solution(2, 2, new int[][]{})); // 2
        System.out.println(o.solution(3, 3, new int[][]{{2, 1}})); // 3
        System.out.println(o.solution(3, 3, new int[][]{{1, 2}})); // 3
        System.out.println(o.solution(4, 3, new int[][]{{2, 2}})); // 4
        System.out.println(o.solution(3, 3, new int[][]{{2, 1}, {1, 2}})); // 0
        System.out.println(o.solution(4, 4, new int[][]{{2, 2}, {3, 3}})); // 4
        System.out.println(o.solution(4, 4, new int[][]{{1, 2}, {1, 3}, {1, 4}})); // 1
        System.out.println(o.solution(7, 7, new int[][]{})); // 924
    }

    public int solution(int m, int n, int[][] puddles) {

        int[][] dp = new int[n][m];
        for (int[] puddle : puddles) {
            int x = puddle[0] - 1;
            int y = puddle[1] - 1;
            dp[y][x] = -1;
        }

        dp[0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dp[i][j] == -1) continue;
                if (i == 0 && j == 0) continue;

                int up = (i > 0 && dp[i - 1][j] != -1)
                        ? dp[i - 1][j]
                        : 0;
                int left = (j > 0 && dp[i][j - 1] != -1)
                        ? dp[i][j - 1]
                        : 0;

                dp[i][j] = (up + left) % 1000000007;

            }
        }
        return dp[n - 1][m - 1];
    }

}

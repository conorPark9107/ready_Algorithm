package programmers;

// 거스름돈
// https://school.programmers.co.kr/learn/courses/30/lessons/12907
public class Level03_거스름돈 {

    public static void main(String[] args) {
        Level03_거스름돈 o = new Level03_거스름돈();
        System.out.println(o.solution(5, new int[]{1, 2, 5})); // 4

    }

    public int solution(int n, int[] money) {

        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int coin : money) {
            for (int i = coin; i <= n; i++) {
                dp[i] += dp[i - coin];
            }
        }

        return dp[n];
    }

}

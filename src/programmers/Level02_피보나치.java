package programmers;

// 피보나치 수
// https://school.programmers.co.kr/learn/courses/30/lessons/12945
public class Level02_피보나치 {


    public static void main(String[] args) {
        Level02_피보나치 o = new Level02_피보나치();
        System.out.println(o.solution(3)); // 2
        System.out.println(o.solution(5)); // 5
    }


    public int solution(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1]) % 1234567;
        }
        return dp[n];
    }

}

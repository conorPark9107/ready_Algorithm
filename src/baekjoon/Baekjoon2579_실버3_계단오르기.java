package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 계단 오르기
// https://www.acmicpc.net/problem/2579
public class Baekjoon2579_실버3_계단오르기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] score = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[n + 1];
        dp[1] = score[1];
        dp[2] = score[1] + score[2];
        for (int i = 3; i <= n; i++) {
            int oneStep = dp[i - 3] + score[i - 1] + score[i];
            int twoStep = dp[i - 2] + score[i];
            dp[i] = Math.max(oneStep, twoStep);
        }
        System.out.println(dp[n]);
    }
}


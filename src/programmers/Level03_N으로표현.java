package programmers;

import java.util.HashSet;
import java.util.List;

// N으로 표현
// https://school.programmers.co.kr/learn/courses/30/lessons/42895
public class Level03_N으로표현 {

    public static void main(String[] args) {
        Level03_N으로표현 o = new Level03_N으로표현();
        System.out.println(o.solution(5, 12)); // 4
        System.out.println(o.solution(2, 11)); // 3
    }


    public int solution(int N, int number) {
        if (N == number) return 1;

        HashSet<Integer>[] dp = new HashSet[9];
        dp[1] = new HashSet<>(List.of(N));

        for (int i = 2; i <= 8; i++) {
            HashSet<Integer> curr = new HashSet<>();

            for (int j = 1; j < i; j++) {
                HashSet<Integer> set1 = dp[j];
                HashSet<Integer> set2 = dp[i - j];

                for (Integer num1 : set1) {
                    for (Integer num2 : set2) {
                        curr.add((num1 + num2));
                        curr.add((num1 - num2));
                        curr.add((num1 * num2));
                        if (num2 != 0) curr.add((num1 / num2));
                    }
                }
            }
            int num = 0;
            for (int j = 0; j < i; j++) {
                num = (num * 10) + N;
            }
            curr.add(num);
            dp[i] = curr;
        }

        int answer = -1;
        for (int i = 1; i <= 8; i++) {
            if (dp[i].contains(number)) {
                answer = i;
                break;
            }
        }
        return answer;
    }

}

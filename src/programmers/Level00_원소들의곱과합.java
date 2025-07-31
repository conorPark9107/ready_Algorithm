package programmers;

import java.util.Arrays;

// 원소들의 곱과 합
// https://school.programmers.co.kr/learn/courses/30/lessons/181929
public class Level00_원소들의곱과합 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 4, 5, 2, 1})); // 1
        System.out.println(solution(new int[]{5, 7, 8, 3})); // 0
        System.out.println(solution(new int[]{1, 2})); // 1
        System.out.println(solution(new int[]{})); // 0
    }

    public static int solution(int[] num_list) {
        int multiplication = Arrays.stream(num_list)
                                    .reduce(1, ((a, b) -> a * b));
        int sum = Arrays.stream(num_list).sum();
        int square = sum * sum;
        return (multiplication < square)? 1 : 0;
    }

}

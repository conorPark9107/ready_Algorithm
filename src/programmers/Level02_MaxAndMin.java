package programmers;

import java.util.Arrays;
import java.util.Optional;

// 최댓값과 최솟값
// https://school.programmers.co.kr/learn/courses/30/lessons/12939
public class Level02_MaxAndMin {
    public static void main(String[] args) {
        System.out.println(solution("1 2 3 4")); // 1 4
        System.out.println(solution("-1 -2 -3 -4")); // -4 -1
        System.out.println(solution("-1 -1")); // -1 -1
    }

    public static String solution(String s) {
        Integer[] arr = Arrays.stream(s.split(" "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
        int max = Arrays.stream(arr).max(Integer::compareTo).get();
        int min = Arrays.stream(arr).min(Integer::compareTo).get();
        return min + " " + max;
    }

}

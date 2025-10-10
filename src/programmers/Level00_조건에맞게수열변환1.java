package programmers;

import java.util.Arrays;

// 조건에 맞게 수열 변환하기 1
// https://school.programmers.co.kr/learn/courses/30/lessons/181882
public class Level00_조건에맞게수열변환1 {

    public static void main(String[] args) {
        int[] arr = solution(new int[]{1, 2, 3, 100, 99, 98});
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [2, 2, 6, 50, 99, 49]
    }

    public static int[] solution(int[] arr) {
        return Arrays.stream(arr)
                .map(v -> (v >= 50 && v % 2 == 0)? v / 2
                        : (v < 50 && v % 2 == 1) ? v * 2
                        : v)
                .toArray();
    }

}

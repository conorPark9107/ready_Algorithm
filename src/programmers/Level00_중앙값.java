package programmers;

import java.util.Arrays;

// 중앙값 구하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120811
public class Level00_중앙값 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 7, 10, 11})); // 7
        System.out.println(solution(new int[]{9, -1, 0})); // 0
    }

    public static int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }

}

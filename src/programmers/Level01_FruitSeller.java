package programmers;

import java.util.Arrays;
import java.util.Collections;

// 과일 장수
// https://school.programmers.co.kr/learn/courses/30/lessons/135808
public class Level01_FruitSeller {

    public static void main(String[] args) {
        System.out.println(betterThanMyCodeSolution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1})); // 8
        System.out.println(betterThanMyCodeSolution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2})); // 33
    }

    public static int solution(int k, int m, int[] score) {
        int answer = 0;

        Integer[] arr = Arrays.stream(score).
                        boxed().
                        toArray(Integer[]::new);

        Arrays.sort(arr, Collections.reverseOrder());

        int boxes = score.length / m;
        for (int i = 0; i < boxes; i++) {
            int min = k + 1;
            int j = 0;
            while (j < m) {
                min = Math.min(min, arr[j + (i * m)]);
                j++;
            }
            answer += min * m;
        }

        return answer;
    }

    public static int betterThanMyCodeSolution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        // 정렬된 배열을 m개로 자르고, 자른 배열에서 첫번째 요소는 무조건 가장 점수가 낮은 과일이니까
        // m개씩 감소하며, 과일 * 개수(m) 누적.
        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m;
        }

        return answer;
    }

}

package programmers;

import java.util.Arrays;

// 수열과 구간 쿼리 1
// https://school.programmers.co.kr/learn/courses/30/lessons/181883
public class Level00_수열과_구간_쿼리1 {

    public static void main(String[] args) {
        int[] arr = solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 1},{1, 2}, {2, 3}});
        Arrays.stream(arr).forEach(value -> System.out.printf(value + " "));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            for (int j = s; j <= e; j++) {
                arr[j]++;
            }
        }
        return Arrays.copyOf(arr, arr.length);
    }


}

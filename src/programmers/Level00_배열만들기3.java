package programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

// 배열 만들기 3
// https://school.programmers.co.kr/learn/courses/30/lessons/181895
public class Level00_배열만들기3 {

    public static void main(String[] args) {
        int[] arr = solution(new int[]{1,2,3,4,5}, new int[][]{ {1,3}, {0,4}}); // [2, 3, 4, 1, 2, 3, 4, 5]
        Arrays.stream(arr).forEach(v -> System.out.printf(v + " "));
    }

    public static int[] solution(int[] arr, int[][] intervals) {
        return Arrays.stream(intervals)
                .flatMapToInt(interval ->
                        Arrays.stream(Arrays.copyOfRange(arr, interval[0], interval[1] + 1))
                )
                .toArray();
    }

    public static int[] solution02(int[] arr, int[][] intervals) {
        return Arrays.stream(intervals)
                .flatMapToInt(interval ->
                        IntStream.rangeClosed(interval[0], interval[1])
                                .map(i -> arr[i])
                )
                .toArray();
    }

    public static int[] solution03(int[] arr, int[][] intervals) {
        int length = 0;
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            length += end - start + 1;
        }

        int[] answer = new int[length];
        int index = 0;
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            for (int i = start; i <= end; i++) {
                answer[index++] = arr[i];
            }
        }

        return answer;
    }
}

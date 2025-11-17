package programmers;

import java.util.Arrays;

// 정사각형으로 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/181830
public class Level00_정사각형으로만들기 {

    public static void main(String[] args) {
        int[][] arr = solution(new int[][]{{572, 22, 37},{287, 726, 384},{85, 137, 292}, {487, 13, 876}});
        Arrays.stream(arr).forEach(value -> {
            Arrays.stream(value).forEach(value1 -> System.out.print(value1 + " "));
            System.out.println();
        });
        System.out.println();
        // [572, 22, 37, 0], [287, 726, 384, 0], [85, 137, 292, 0], [487, 13, 876, 0]]

        arr = solution(new int[][]{{57, 192, 534, 2},{9, 345, 192, 999}});
        Arrays.stream(arr).forEach(value -> {
            Arrays.stream(value).forEach(value1 -> System.out.print(value1 + " "));
            System.out.println();
        });
        System.out.println();
        // [[57, 192, 534, 2], [9, 345, 192, 999], [0, 0, 0, 0], [0, 0, 0, 0]]

        arr = solution(new int[][]{{1,2}, {3,4}});
        Arrays.stream(arr).forEach(value -> {
            Arrays.stream(value).forEach(value1 -> System.out.print(value1 + " "));
            System.out.println();
        });
        System.out.println();
        // [[1, 2], [3, 4]]
    }

    public static int[][] solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int length = Math.max(row, col);
        int[][] answer = new int[length][length];

        for (int i = 0; i < row; i++) {
            System.arraycopy(arr[i], 0, answer[i], 0, col);
        }

        return answer;
    }

}

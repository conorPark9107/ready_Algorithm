package programmers;

import java.util.Arrays;

// n 번째 원소까지
// https://school.programmers.co.kr/learn/courses/30/lessons/181889
public class Level00_n번째원소까지 {

    public static void main(String[] args) {
        int[] arr = solution(new int[]{2,1,6}, 1); // [2]
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));

        System.out.println();

        arr = solution(new int[]{5, 2, 1, 7, 5}, 3); // [5, 2, 1]
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
    }

    public static int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, 0, n);
    }


}

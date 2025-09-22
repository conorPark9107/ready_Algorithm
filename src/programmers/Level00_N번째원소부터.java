package programmers;

import java.util.Arrays;

// n번째 원소부터
// https://school.programmers.co.kr/learn/courses/30/lessons/181892
public class Level00_N번째원소부터 {

    public static void main(String[] args) {
        int[] arr = solution(new int[]{2, 1, 6}, 3); // [6]
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));

        System.out.println();

        arr = solution(new int[]{5, 2, 1, 7, 5}, 2); // [2, 1, 7, 5]
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
    }

    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];
        for(int i = 0; i < answer.length; i++){
            answer[i] = num_list[n - 1 + i];
        }
        return answer;
    }

}

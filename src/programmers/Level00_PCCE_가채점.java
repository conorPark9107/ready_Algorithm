package programmers;

import java.util.Arrays;

// 가채점
// https://school.programmers.co.kr/learn/courses/30/lessons/250128
public class Level00_PCCE_가채점 {
    public static void main(String[] args) {
        Arrays.stream(solution(new int[]{1}, new int[]{100}, new int[]{100, 80, 90, 84, 20})).forEach(System.out::println);
    }

    public static String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i]-1]) {
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
}

package programmers;

import java.util.Arrays;

public class Level00_카운트다운 {

    public static void main(String[] args) {
        int[] arr = solution(10, 3);
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
    }

    public static int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = start_num--;
        }
        return answer;
    }
}

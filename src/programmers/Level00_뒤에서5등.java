package programmers;

import java.util.Arrays;

// 뒤에서 5등까지
// https://school.programmers.co.kr/learn/courses/30/lessons/181853
public class Level00_뒤에서5등 {

    public static void main(String[] args) {
        int[] arr = solution(new int[]{12, 4, 15, 46, 38, 1, 14});
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // 1, 4, 12, 14, 15
    }


    public static int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list);
        System.arraycopy(num_list, 0, answer, 0, 5);
        return answer;
    }

}

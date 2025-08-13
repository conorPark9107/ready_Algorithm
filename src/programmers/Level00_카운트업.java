package programmers;


import java.util.Arrays;

// 카운트업
// https://school.programmers.co.kr/learn/courses/30/lessons/181920
public class Level00_카운트업 {

    public static void main(String[] args) {
        int[] arr = solution(10, 20);
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
    }

    public static int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        int index = 0;
        for (int i = start_num; i <= end_num; i++) {
            answer[index++] = i;
        }
        return answer;
    }

}

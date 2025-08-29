package programmers;

import java.util.Arrays;
import java.util.Comparator;

// 접미사배열
// https://school.programmers.co.kr/learn/courses/30/lessons/181909
public class Level00_접미사배열 {

    public static void main(String[] args) {
        String[] arr = solution("banana");
        Arrays.stream(arr).forEach(s -> System.out.printf(s + " "));
    }

    public static String[] solution(String my_string) {
        int length = my_string.length();
        String[] answer = new String[length];
        char[] arr = my_string.toCharArray();
        answer[length - 1] = String.valueOf(arr[length - 1]);

        for (int i = length - 2; i >= 0; i--) {
             answer[i] = arr[i] + answer[i+1];
        }

        Arrays.sort(answer, Comparator.naturalOrder());
        return answer;
    }

}
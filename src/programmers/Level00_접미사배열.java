package programmers;

import java.util.Arrays;
import java.util.Comparator;

// 접미사배열
// https://school.programmers.co.kr/learn/courses/30/lessons/181909
public class Level00_접미사배열 {

    public static void main(String[] args) {
        String[] arr = solution("banana");
        Arrays.stream(arr).forEach(s -> System.out.printf(s + " ")); // "a", "ana", "anana", "banana", "na", "nana"

        System.out.println();

        arr = solution("programmers");
        Arrays.stream(arr).forEach(s -> System.out.printf(s + " ")); // "ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"
    }

    public static String[] solution(String my_string) {
        int len = my_string.length();
        String[] arr = new String[len];

        for (int i = 0; i < len; i++) {
            arr[i] = my_string.substring(i);
        }
        Arrays.sort(arr);

        return arr;
    }

    public static String[] solution02(String my_string) {
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
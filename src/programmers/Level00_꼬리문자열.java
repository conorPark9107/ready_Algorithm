package programmers;

import java.util.Arrays;
import java.util.stream.Collectors;

// 꼬리문자열
// https://school.programmers.co.kr/learn/courses/30/lessons/181841
public class Level00_꼬리문자열 {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"abc", "def", "ghi"}, "ef")); // "abcghi"
        System.out.println();
        System.out.println(solution(new String[]{"abc", "bbc", "cbc"}, "c")); // ""
    }

    public static String solution1(String[] str_list, String ex) {
        return Arrays.stream(str_list)
                .map(s -> s.contains(ex)? "" : s)
                .collect(Collectors.joining());
    }

    public static String solution(String[] str_list, String ex) {
        StringBuilder answer = new StringBuilder();
        for (String s : str_list) {
            answer.append(s.contains(ex) ? "" : s);
        }
        return answer.toString();
    }

}

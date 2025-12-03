package programmers;

import java.util.Arrays;
import java.util.stream.Collectors;

// 문자열 정렬하기 2
// https://school.programmers.co.kr/learn/courses/30/lessons/120911
public class Level00_문자열정렬2 {

    public static void main(String[] args) {
        System.out.println(solution("Bcad"));   // abcd
        System.out.println(solution("heLLo"));  // ehllo
        System.out.println(solution("Python")); // hnopty
    }

    public static String solution(String my_string) {
        String answer = my_string.toLowerCase();
        String[] arr = answer.split("");
        Arrays.sort(arr);
        return String.join("", arr);
    }

}

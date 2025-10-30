package programmers;

import java.util.Arrays;

// 공백으로 구분 1
// https://school.programmers.co.kr/learn/courses/30/lessons/181869
public class Level00_공백구분1 {

    public static void main(String[] args) {
        String[] arr = solution("i love you");
        Arrays.stream(arr).forEach(s -> System.out.print(s + " "));
        System.out.println();

        arr = solution("programmers");
        Arrays.stream(arr).forEach(s -> System.out.print(s + " "));
        System.out.println();
    }

    public static String[] solution(String my_string) {
        return my_string.split(" ");
    }

}

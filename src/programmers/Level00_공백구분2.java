package programmers;

import java.util.Arrays;

// 공백으로 구분하기 2
// https://school.programmers.co.kr/learn/courses/30/lessons/181868
public class Level00_공백구분2 {

    public static void main(String[] args) {
        String[] arr = solution(" i    love  you");
        Arrays.stream(arr).forEach(s -> System.out.print(s + " "));
        System.out.println();

        arr = solution("    programmers  ");
        Arrays.stream(arr).forEach(s -> System.out.print(s + " "));
        System.out.println();
    }

    public static String[] solution(String my_string) {
        return my_string.trim().split("\\s+");
    }

}

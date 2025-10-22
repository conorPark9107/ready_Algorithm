package programmers;

import java.util.Arrays;

// ad제거하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181870
public class Level00_AD제거하기 {

    public static void main(String[] args) {
        String[] arr = solution(new String[]{"and","notad","abcd"});
        Arrays.stream(arr).forEach(s -> System.out.print(s + " "));

        System.out.println();
        arr = solution(new String[]{"there","are","no","a","ds"});
        Arrays.stream(arr).forEach(s -> System.out.print(s + " "));
    }


    public static String[] solution(String[] strArr) {
        return Arrays.stream(strArr)
                .filter(s -> !s.contains("ad"))
                .toArray(String[]::new);
    }

}

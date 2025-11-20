package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

// 문자열 바꿔서 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/181864
public class Level00_문자열바꿔서찾기 {

    public static void main(String[] args) {
        System.out.println(solution("ABBAA", "AABB")); // 1
        System.out.println(solution("ABAB", "ABAB")); // 0
    }
    public static int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        for (char c : myString.toCharArray()) {
            sb.append(c == 'A'? "B" : "A");
        }
        return sb.toString().contains(pat)? 1 : 0;
    }

    public static int solution01(String myString, String pat) {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "B");
        map.put("B", "A");
        String updated = Arrays.stream(myString.split(""))
                                .map(map::get)
                                .collect(Collectors.joining());
        return updated.contains(pat)? 1 : 0;
    }

}


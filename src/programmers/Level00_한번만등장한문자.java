package programmers;

import java.util.Arrays;

// 한번만 등장한 문자
// https://school.programmers.co.kr/learn/courses/30/lessons/120896
public class Level00_한번만등장한문자 {

    public static void main(String[] args) {
        System.out.println(solution("abcabcadc")); // d
        System.out.println(solution("abdc")); // abcd
        System.out.println(solution("hello")); // eho
    }

    public static String solution(String s) {
        return s.replaceAll("[a-z]", s);
    }

    public static String solution01(String s) {
        int[] count = new int[26];
        StringBuilder answer = new StringBuilder();
        for (char c : s.toCharArray()) count[c - 'a']++;
        for (int i = 0; i < count.length; i++) {
            if(count[i] == 1){
                answer.append(Character.toString('a' + i));
            }
        }
        return answer.toString();
    }

}

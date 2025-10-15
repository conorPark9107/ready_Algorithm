package programmers;

import java.util.Locale;

// 원하는 문자열 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/181878
public class Level00_원하는문자열찾기 {

    public static void main(String[] args) {
        System.out.println(solution("AbCdEfG", "aBc")); // 1
        System.out.println(solution("aaAA", "aaaaa")); // 0
        System.out.println(solution("aaAAB", "b")); // 1
        System.out.println(solution("b", "B")); // 1
    }

    public static int solution(String myString, String pat) {
        for (int i = 0; i + pat.length() <= myString.length(); i++) {
            String substring = myString.substring(i, i + pat.length());
            String uppercase = substring.toUpperCase();
            if(uppercase.equals(pat.toUpperCase())) return 1;
        }
        return 0;
    }

    public static int solution01(String myString, String pat) {
        return myString.toUpperCase().startsWith(pat.toUpperCase()) ? 1 : 0;
    }

}

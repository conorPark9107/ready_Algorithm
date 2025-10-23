package programmers;


import java.util.stream.IntStream;

// 문자열이 몇 번 등장하는지 세기
// https://school.programmers.co.kr/learn/courses/30/lessons/181871
public class Level00_문자열등장횟수 {

    public static void main(String[] args) {
        System.out.println(solution("banana", "ana")); // 2
        System.out.println(solution("aaaa", "aa")); // 3


    }

    public static int solution(String myString, String pat) {
        int answer = 0;
        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            String subString = myString.substring(i, i + pat.length());
            if(subString.equals(pat)) answer++;
        }
        return answer;
    }

}

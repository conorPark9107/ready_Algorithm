package programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

// 둘만의 암호
// https://school.programmers.co.kr/learn/courses/30/lessons/155652
public class Level01_secretCode {
    public static void main(String[] args) {
        System.out.println(solution("aukks", "wbqd", 5));
    }

    public static String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < skip.length(); i++) {
            set.add(skip.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            char n = s.charAt(i);

            for (int j = 0; j < index; j++) {
                n++;
                if(n > 'z'){
                    n = 'a';
                }
                if(set.contains(n)) {
                    j--;
                }
            }
            answer.append(n);
        }

        return answer.toString();
    }



}

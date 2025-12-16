package programmers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.stream.Collectors;

// 문자열 밀기
// https://school.programmers.co.kr/learn/courses/30/lessons/120921
public class Level00_문자열밀기 {

    public static void main(String[] args) {
        System.out.println(solution("hello", "elloh")); // 4
        System.out.println(solution("hello", "lohel")); // 2
        System.out.println(solution("hello", "ohell")); // 1
        System.out.println(solution("apple", "elppa")); // -1
        System.out.println(solution("atat", "tata")); // 1
        System.out.println(solution("abc", "abc")); // 0
    }

    public static int solution(String A, String B) {
        if(A.equals(B)) return 0;
        String AA = A + A;
        int answer = A.length() - AA.lastIndexOf(B);
        return answer < A.length()
               ? answer
               : -1;
    }


    public static int solution01(String A, String B) {
        int answer = 0;
        Deque<Character> dq = new ArrayDeque<>();
        for (char c : A.toCharArray()) {
            dq.addLast(c);
        }
        for (int i = 0; i < dq.size(); i++) {
            String newStr = dq.stream()
                              .map(String::valueOf)
                              .collect(Collectors.joining());
            if(newStr.equals(B)) return answer;
            answer++;
            dq.addFirst(dq.pollLast());
        }
        return -1;
    }

}

package programmers;

import java.util.*;

// 괄호 회전하기
// https://school.programmers.co.kr/learn/courses/30/lessons/76502
public class Level02_괄호회전하기 {

    public static void main(String[] args) {
        System.out.println(solution("[](){}")); // 3
        System.out.println(solution("}]()[{")); // 2
        System.out.println(solution("[)(]")); // 0
        System.out.println(solution("}}}")); // 0
        System.out.println(solution("(((")); // 0
    }

    public static int solution(String s) {
        int answer = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            Deque<Character> stack = new ArrayDeque<>();
            boolean status = true;

            for (int j = 0; j < length; j++) {
                char c = s.charAt((i + j) % length);
                switch (c) {
                    case '(', '{', '[' -> stack.push(c);
                    case ')', '}', ']' -> {
                        if(stack.isEmpty()){
                            status = false;
                            break;
                        }
                        char pop = stack.pop();
                        if((c == ')' && pop != '(') ||
                           (c == '}' && pop != '{') ||
                           (c == ']' && pop != '[') ){
                            status = false;
                            break;
                        }
                    }
                }
            }
            if(status && stack.isEmpty()) answer++;
        }
        return answer;
    }

}



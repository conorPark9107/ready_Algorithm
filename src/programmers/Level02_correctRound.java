package programmers;

import java.util.Stack;

// 올바른 괄호
// https://school.programmers.co.kr/learn/courses/30/lessons/12909
public class Level02_correctRound {

    public static void main(String[] args) {
        System.out.println(solution("()()"));
        System.out.println(solution("(())()"));
        System.out.println(solution(")()("));
        System.out.println(solution("(()("));
    }

    static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '('){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;
                else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

}

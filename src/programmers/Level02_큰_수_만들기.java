package programmers;

import java.util.ArrayDeque;
import java.util.stream.Collectors;

// 큰 수 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/42883
public class Level02_큰_수_만들기 {

    public static void main(String[] args) {
        Level02_큰_수_만들기 o = new Level02_큰_수_만들기();
        System.out.println(o.solution("1924", 2));       // 94
        System.out.println(o.solution("1231234", 3));    // 3234
        System.out.println(o.solution("4177252841", 4)); // 775841
    }

    public String solution(String number, int k) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        char[] arr = number.toCharArray();

        for (char value : arr) {
            int c = value - '0';
            if (k == 0) {
                stack.addLast(c);
            } else {
                while (!stack.isEmpty() && k > 0 && stack.peekLast() < c) {
                    stack.pollLast();
                    k--;
                }
                stack.addLast(c);
            }
        }
        return stack.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

}

package programmers;

import java.util.*;


// 짝지어 제거하기.
// https://school.programmers.co.kr/learn/courses/30/lessons/12973
public class Level02_RmoveinPairs {

    public static void main(String[] args) {
        System.out.println(solution("baabaa")); // 1
        System.out.println(solution("aabb")); // 1
        System.out.println(solution("baab")); // 1
        System.out.println(solution("aaab")); // 0
        System.out.println(solution("aaababbaba")); // 1
        System.out.println(solution("cdcd")); // 0
        System.out.println(solution("ccd")); // 0
    }

    public static int solution(String s){

        if(s.length() % 2 != 0) return 0;

        Stack<String> stack = new Stack<>();
        String[] arr = s.split("");
        for (String ss : arr) {
            if(stack.isEmpty()){
                stack.push(ss);
            }else{
                String peek = stack.peek();
                if(peek.equals(ss)){
                    stack.pop();
                }else{
                    stack.push(ss);
                }
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

    public static int solution02(String s)
    {
        if(s.length() % 2 != 0) return 0;

        StringBuilder sb = new StringBuilder(s);

        for (int i = 1; i < sb.length(); i++) {
            char prev = sb.charAt(i-1);
            char now = sb.charAt(i);

            if(prev == now){
                sb.delete(i - 1, i + 1);
                i = 0;
            }
        }
        return sb.length() == 0? 1 : 0;
    }

    public static int solution01(String s){

        if(s.length() % 2 != 0) return 0;

        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            q.offer(s.charAt(i));
        }

        for(int i = 0; i < q.size() && q.size() >= 2; i++){
            char now = q.poll();
            if(now == q.peek()){
                q.poll();
                i = 0;
            }else{
                q.offer(now);
            }
        }

        return q.isEmpty() ? 1 : 0;
    }

}

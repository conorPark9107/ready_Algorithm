package programmers;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

// 공던지기
// https://school.programmers.co.kr/learn/courses/30/lessons/120843
public class Level00_공던지기 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4}, 2)); // 3
        System.out.println(solution(new int[]{1,2,3,4,5,6}, 5)); // 3
        System.out.println(solution(new int[]{1,2,3}, 3)); // 2
        System.out.println(solution(new int[]{1,2,3}, 4)); // 1
    }

    public static int solution01(int[] numbers, int k) {
        int step = 2;
        int moves = k - 1;
        return numbers[(step * moves) % numbers.length];
    }

    public static int solution(int[] numbers, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        for(int a : numbers) deque.add(a);
        for (int i = 1; i < k; i++) {
            deque.offerLast(deque.pollFirst());
            deque.offerLast(deque.pollFirst());
        }
        return deque.getFirst();
    }

}

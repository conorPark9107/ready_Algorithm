package programmers;

import java.util.Arrays;
import java.util.HashSet;

// 연속 부분 수열 합의 개수
// https://school.programmers.co.kr/learn/courses/30/lessons/131701
public class Level02_연속부분수열합의개수 {

    public static void main(String[] args) {
        System.out.println("answer : " + solution(new int[]{7,9,1,1,4})); // 18
    }

    public static int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();
        int l = elements.length;
        for (int i = 0; i < l; i++) {
            int sum = 0;
            for (int j = i; j < l + i; j++) {
                int next = sum + elements[j % l];
                set.add(next);
                sum = next;
            }
        }
        return set.size();
    }

}

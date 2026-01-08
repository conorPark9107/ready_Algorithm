package programmers;

import java.util.ArrayList;


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

// 소인수분해
// https://school.programmers.co.kr/learn/courses/30/lessons/120852
public class Level00_소인수분해 {

    public static void main(String[] args) {
        int[] arr = solution(12);
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [2, 3]
        System.out.println();

        arr = solution(17);
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // 17
        System.out.println();

        arr = solution(420);
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [2, 3, 5, 7]
        System.out.println();

        arr = solution(2);
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [2]
        System.out.println();

        arr = solution(7);
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [7]
        System.out.println();
    }

    public static int[] solution(int n) {
        HashSet<Integer> set = new LinkedHashSet<>();
        int num = 2;
        while (num * num <= n) {
            while (n % num == 0) {
                set.add(num);
                n /= num;
            }
            num++;
        }
        if (n > 1) {
            set.add(n);
        }
        return set.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

}

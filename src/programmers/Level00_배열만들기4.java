package programmers;

import java.util.*;

// 배열 만들기 4
//  https://school.programmers.co.kr/learn/courses/30/lessons/181918
public class Level00_배열만들기4 {

    public static void main(String[] args) {
        int[] arr = solution(new int[] {1,4,2,5,3});
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
    }


    public static int[] solution(int[] arr) {
        Deque<Integer> stk = new ArrayDeque<>();
        for (int arrNum : arr) {
            while (!stk.isEmpty() && stk.getLast() >= arrNum) {
                stk.removeLast();
            }
            stk.addLast(arrNum);
        }
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }


}

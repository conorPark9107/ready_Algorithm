package programmers;

import java.util.ArrayDeque;
import java.util.Arrays;

// 배열 조각하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181893
public class Level00_배열조각하기 {

    public static void main(String[] args) {
        int[] arr = solution(new int[]{0,1,2,3,4,5}, new int[]{4,1,2});
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // 1, 2, 3
    }

    public static int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                end = start + query[i] - 1;
            } else {
                start += query[i];
            }
        }

        return Arrays.copyOfRange(arr, start, end + 2);
    }

    public static int[] solution02(int[] arr, int[] query) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        Arrays.stream(arr).forEach(deque::add);

        for (int i = 0; i < query.length; i++) {
            int limit = query[i];
            if (i % 2 == 0) {
                while(deque.size() - 1 > limit) deque.removeLast();
            }else{
                int firstIndex = 0;
                while(firstIndex++ < limit) deque.removeFirst();
            }
        }

        return deque.stream().mapToInt(Integer::intValue).toArray();
    }

}

package programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

// 배열의 길이를 2의 거듭제곱으로 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/181857
public class Level00_배열의길이거듭제곱만들기 {

    public static void main(String[] args) {
        int[] arr = solution(new int[]{1, 2, 3, 4, 5, 6});
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [1, 2, 3, 4, 5, 6, 0, 0]
        System.out.println();

        arr = solution(new int[]{58, 172, 746, 89});
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [58, 172, 746, 89]
        System.out.println();

        arr = solution(new int[]{1, 2});
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [1, 2]
        System.out.println();

        arr = solution(new int[]{1});
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [1, 0]
        System.out.println();

        arr = solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0, 0, 0]
        System.out.println();

        int[] arr2 = IntStream.rangeClosed(1, 1024).toArray();
        arr = solution(arr2);
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [1, 2, 3, 4, ... 1000 ... 0, 0, 0, 0 ...]
        System.out.println();
    }

    public static int[] solution(int[] arr) {
        int count = 1;
        while(count < arr.length) count <<= 1;
        int[] answer = new int[count];
        System.arraycopy(arr, 0, answer, 0, arr.length);
        return answer;
    }

}

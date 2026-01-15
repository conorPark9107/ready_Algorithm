package programmers;

import java.util.Arrays;

// 조건에 맞게 수열 변환3
// https://school.programmers.co.kr/learn/courses/30/lessons/181835
public class Level00_조건에맞게수열변환3 {

    public static void main(String[] args) {
        int[] arr = solution(new int[]{1, 2, 3, 100, 99, 98}, 3);
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [3, 6, 9, 300, 297, 294]
        System.out.println();

        arr = solution(new int[]{1, 2, 3, 100, 99, 98}, 2);
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [3, 4, 5, 102, 101, 100]
        System.out.println();
    }

    public static int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(k % 2 == 0) answer[i] = (arr[i] * k) + k;
            else answer[i] = arr[i] * k;
        }
        return answer;
    }

}

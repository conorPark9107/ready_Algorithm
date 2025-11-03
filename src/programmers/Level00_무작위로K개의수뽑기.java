package programmers;

import java.util.Arrays;
import java.util.LinkedHashSet;

// 무작위로 K개의 수 뽑기
// https://school.programmers.co.kr/learn/courses/30/lessons/181858
public class Level00_무작위로K개의수뽑기 {

    public static void main(String[] args) {
        int[] arr = solution(new int[]{0, 1, 1, 2, 2, 3}, 3);
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [0, 1, 2]

        System.out.println();

        arr = solution(new int[]{0, 1, 1, 1, 1}, 4);
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [0, 1, -1, -1]
        System.out.println();

        arr = solution(new int[]{10, 0, 0, 0, 11}, 4);
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
    }

    public static int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        int[] limited = Arrays.stream(arr)
                              .distinct()
                              .limit(k)
                              .toArray();
        System.arraycopy(limited, 0, answer, 0, limited.length);
        return answer;
    }


    public static int[] solution01(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);

        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        for (int x : arr) hashSet.add(x);

        int index = 0;
        for(int x : hashSet) {
            if(index == k) break;
            answer[index++] = x;
        }
        return answer;
    }

}

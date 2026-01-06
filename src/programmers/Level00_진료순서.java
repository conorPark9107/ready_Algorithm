package programmers;

import java.util.Arrays;

// 진료 순서 정하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120835
public class Level00_진료순서 {

    public static void main(String[] args) {
        int[] arr = solution(new int[]{3, 76, 24});
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
        System.out.println();

        arr = solution(new int[]{1, 2, 3, 4, 5, 6, 7});
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
        System.out.println();

        arr = solution(new int[]{30, 10, 23, 6, 100});
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
        System.out.println();

    }

    public static int[] solution(int[] emergency) {
        int length = emergency.length;
        int[] answer = new int[length];
        int[] clone = new int[length];
        System.arraycopy(emergency, 0, clone, 0, length);
        Arrays.sort(clone);
        int index = length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (clone[i] == emergency[j]) {
                    answer[j] = index--;
                }
            }
        }
        return answer;
    }

}

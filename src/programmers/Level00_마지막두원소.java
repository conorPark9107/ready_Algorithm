package programmers;

import java.util.Arrays;

public class Level00_마지막두원소 {

    public static void main(String[] args) {
        int[] arr = solution(new int[]{2,1,6});
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println("----------------------------------------");
        int[] arr2 = solution(new int[]{5,2,1,7,5});
        Arrays.stream(arr2).forEach(System.out::println);
    }

    public static int[] solution(int[] num_list) {
        int len = num_list.length;
        int a = num_list[len - 1];
        int b = num_list[len - 2];
        int lastValue =  a > b? a - b : a * 2;
        int[] answer = Arrays.copyOf(num_list, len + 1);
        answer[len] = lastValue;

        return answer;
    }

}

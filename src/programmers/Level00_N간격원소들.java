package programmers;

import java.util.Arrays;

// N 간격의 원소들
// https://school.programmers.co.kr/learn/courses/30/lessons/181888
public class Level00_N간격원소들 {

    public static void main(String[] args) {
        int[] arr = solution(new int[]{4,2,6,1,7,6}, 2);
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [4, 6, 7]

        System.out.println();

        arr = solution(new int[]{4,2,6,1,7,6}, 4);
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [4, 7]

        System.out.println();

        arr = solution(new int[]{4,2,6,1,7,8,9,10,11,12,13,14,15}, 4);
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [4, 7]

        System.out.println();
    }

    public static int[] solution(int[] num_list, int n) {
        int length = (num_list.length + (n - 1)) / n;
        int[] answer = new int[length];
        for(int i = 0; i < length; i++){
            answer[i] = num_list[i * n];
        }
        return answer;
    }

    public static int[] solution02(int[] num_list, int n) {
        int len = num_list.length / n;
        int length = (num_list.length % n == 0)?  len : len + 1;
        int[] answer = new int[length];
        int index = 0;
        for(int i = 0; i < num_list.length; i += n){
            answer[index++] = num_list[i];
        }
        return answer;
    }

}

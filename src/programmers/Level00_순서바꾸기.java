package programmers;


import java.util.Arrays;
import java.util.stream.IntStream;

// 순서 바꾸기
// https://school.programmers.co.kr/learn/courses/30/lessons/181891
public class Level00_순서바꾸기 {

    public static void main(String[] args) {
        int[] arr = solution(new int[]{2,1,6}, 1);
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [1, 6, 2]

        System.out.println();
        System.out.println();

        arr = solution(new int[]{5, 2, 1, 7, 5}, 3);
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [7, 5, 5, 2, 1]

    }

    public static int[] solution(int[] num_list, int n) {
//        IntStream.range(0, num_list.length).forEach(i -> System.out.println((i + n) % num_list.length));
        return IntStream.range(0, num_list.length).map(i -> num_list[(i + n) % num_list.length]).toArray();
    }

    public static int[] solution02(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int[] start = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] end = Arrays.copyOfRange(num_list, 0, n);
        System.arraycopy(start, 0, answer, 0, start.length);
        System.arraycopy(end, 0, answer, start.length, end.length);
        return answer;
    }

}

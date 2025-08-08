package programmers;


import java.util.Arrays;

// 수열과 구간 쿼리 3
// https://school.programmers.co.kr/learn/courses/30/lessons/181924
public class Level00_수열과구간쿼리3 {

    public static void main(String[] args) {
        int[] arr = solution(new int[]{0, 1, 2, 3, 4}, new int[][]{
                {0, 3},
                {1, 2},
                {1, 4},
        });

        Arrays.stream(arr).forEach(System.out::print);
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for(int[] query : queries){
            int i = query[0];
            int j = query[1];
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

}

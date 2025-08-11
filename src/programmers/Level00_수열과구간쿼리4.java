package programmers;


import java.util.Arrays;

// 수열과 구간 쿼리 4
// https://school.programmers.co.kr/learn/courses/30/lessons/181922
public class Level00_수열과구간쿼리4 {

    public static void main(String[] args) {
        int[] arr = solution(new int[]{0, 1, 2, 4, 3}, new int[][]{
                {0, 4, 1},
                {0, 3, 2},
                {0, 3, 3},
        });

        Arrays.stream(arr).forEach(System.out::print); // 3, 2, 4, 6, 4
    }


    public static int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            for (int i = s; i <= e; i++) {
                if(i % k == 0) arr[i]++;
            }
        }
        return arr;
    }
}

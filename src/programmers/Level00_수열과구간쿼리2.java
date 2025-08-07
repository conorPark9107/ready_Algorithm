package programmers;

import java.util.Arrays;

// 수열과 구간 쿼리 2
// https://school.programmers.co.kr/learn/courses/30/lessons/181923
public class Level00_수열과구간쿼리2 {

    public static void main(String[] args) {
        int[] arr = solution(new int[]{0, 1, 2, 4, 3}, new int[][]{
                {0, 4, 2},
                {0, 3, 2},
                {0, 2, 2},
                {0, 2, 2}
        });

        Arrays.stream(arr).forEach(System.out::print);
    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for(int i = 0; i < queries.length; i++){
            int min = 1000001;
            int start = queries[i][0];
            int end = queries[i][1];
            int criteria = queries[i][2];

            for (int j = start; j <= end; j++) {
                if(arr[j] > criteria){
                    min = Math.min(min, arr[j]);
                }
            }
            answer[i] = (min == 1000001)? -1 : min;
        }

        return answer;
    }

}

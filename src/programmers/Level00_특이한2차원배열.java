package programmers;

import java.util.Arrays;

// 특이한 2차원 배열
//
public class Level00_특이한2차원배열 {

    public static void main(String[] args) {
        int[][] arr = solution(3);
        System.out.println("[");
        Arrays.stream(arr).forEach(ints -> {
            System.out.print("[");
            Arrays.stream(ints).forEach(value -> {
                System.out.print(value + " ");
            });
            System.out.print("]");
        });
        System.out.println("]");
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j){
                    answer[i][j] = 1;
                }else{
                    answer[i][j] = 0;
                }
            }
        }
        return answer;
    }

}

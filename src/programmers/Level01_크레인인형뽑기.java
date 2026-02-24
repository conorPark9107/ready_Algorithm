package programmers;

import java.util.Stack;

// 크레인 인형 뽑기
// https://school.programmers.co.kr/learn/courses/30/lessons/64061
public class Level01_크레인인형뽑기 {

    public static void main(String[] args) {
        Level01_크레인인형뽑기 o = new Level01_크레인인형뽑기();
        System.out.println(o.solution(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        }, new int[]{1, 5, 3, 5, 1, 2, 1, 4})); // 4
    }

    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> basket = new Stack<>();
        for (int move : moves) {
            int index = move - 1;
            for (int i = 0; i < board.length; i++) {
                int doll = board[i][index];
                if (doll == 0) continue;
                board[i][index] = 0;
                if (!basket.isEmpty() && basket.peek() == doll) {
                    basket.pop();
                    answer += 2;
                } else {
                    basket.push(doll);
                }
                break;
            }
        }

        return answer;
    }

}

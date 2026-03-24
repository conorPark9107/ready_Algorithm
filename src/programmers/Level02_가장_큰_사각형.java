package programmers;

// 가장 큰 사각형
// https://school.programmers.co.kr/learn/courses/30/lessons/12905
public class Level02_가장_큰_사각형 {

    public static void main(String[] args) {

        Level02_가장_큰_사각형 o = new Level02_가장_큰_사각형();
        System.out.println(o.solution(new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}})); // 9
        System.out.println(o.solution(new int[][]{{0, 0, 1, 1},
                {1, 1, 1, 1}})); // 4


    }

    public int solution(int[][] board) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1 && i > 0 && j > 0) {
                    board[i][j] = Math.min(board[i - 1][j - 1],
                            Math.min(board[i - 1][j], board[i][j - 1])) + 1;
                }
                answer = Math.max(answer, board[i][j]);
            }
        }
        return answer * answer;
    }

}

package programmers;



public class Level01_PCCE_09 {

    public static void main(String[] args) {
        int result01 = solution(new String[][] {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}}, 3, 3);
        System.out.println(result01); // 2

        int result02 = solution(new String[][] {{"yellow", "green", "blue"}, {"blue", "green", "yellow"}, {"yellow", "blue", "blue"}}, 0, 1);
        System.out.println(result02); // 1
    }


    public static int solution(String[][] board, int h, int w) {
        int answer = 0;

        int len = board.length;
        int[] mh = {-1, 1, 0, 0};
        int[] mw = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            int dh = h + mh[i];
            int dw = w + mw[i];

            if(dh < 0 || dh >= len || dw < 0 || dw >= len) continue;

            if(board[h][w].equals(board[dh][dw])) answer++;
        }

        return answer;
    }

}

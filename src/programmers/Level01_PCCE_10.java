package programmers;

import java.util.Arrays;

public class Level01_PCCE_10 {

    public static void main(String[] args) {
        int result = solution(
                new int[]{5, 3, 4 ,2},
                new String[][] {{"A", "A", "-1", "B", "B", "B", "B", "-1"},
                                {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                                {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
                                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"},
                                {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"},
                                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}}
        );

        System.out.println(result);
    }


    public static int solution(int[] mats, String[][] park) {
        int answer = -1;

        int l = park.length;
        int ll = park[0].length;

        Arrays.sort(mats);

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < ll; j++) {
                if (!park[i][j].equals("-1")) continue;
                answer = Math.max(answer, getLaySize(mats, park, i, j));
            }
        }
        return answer;
    }

    private static int getLaySize(int[] mats, String[][] park, int iIndex, int jIndex) {
        int max = -1;

        for (int mat : mats) {
            for (int x = iIndex; x < iIndex + mat; x++) {
                if (x >= park.length) return max;

                for (int y = jIndex; y < jIndex + mat; y++) {
                    if (y >= park[0].length) return max;
                    if (!park[x][y].equals("-1")) return max;
                }
            }

            max = Math.max(max, mat);
        }
        return max;
    }

}

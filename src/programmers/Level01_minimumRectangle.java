package programmers;

public class Level01_minimumRectangle {
    public static void main(String[] args) {
        System.out.println(solution(new int [][]{{60, 50},
                                                 {30, 70},
                                                 {60, 30},
                                                 {80, 40}})); // 4000
        System.out.println(solution(new int [][]{{10, 7},
                                                 {12, 3},
                                                 {8, 15},
                                                 {14, 7},
                                                 {5, 15}})); // 120
        System.out.println(solution(new int [][]{{14, 4},
                                                 {19, 6},
                                                 {6, 16},
                                                 {18, 7},
                                                 {7, 11}})); // 133
    }

    public static int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        // 가장 긴 부분을 가로로.
        // 가로, 세로에서 짧은 부분을 찾고, 이들중 가장 큰 값(짧은 쪽을 모두 수용 가능한)
        for (int i = 0; i < sizes.length; i++) {
            int width  = Math.max(sizes[i][0], sizes[i][1]);
            int height = Math.min(sizes[i][0], sizes[i][1]);

            maxWidth = Math.max(maxWidth, width);
            maxHeight = Math.max(maxHeight, height);
        }

        return maxWidth * maxHeight;
    }



}

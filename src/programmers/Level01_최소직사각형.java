package programmers;

import java.util.Arrays;

// 최소 직사각형
// https://school.programmers.co.kr/learn/courses/30/lessons/86491
public class Level01_최소직사각형 {

    public static void main(String[] args) {
        Level01_최소직사각형 o = new Level01_최소직사각형();
        System.out.println(o.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}})); // 4000
        System.out.println(o.solution(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}})); // 120
        System.out.println(o.solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}})); // 133
    }

    public int solution(int[][] sizes) {
        int maxGroup = -1;
        int minGroup = -1;

        for (int[] arr : sizes) {
            int w = arr[0];
            int h = arr[1];

            if (w > h) {
                maxGroup = Math.max(maxGroup, w);
                minGroup = Math.max(minGroup, h);
            } else if (h > w) {
                maxGroup = Math.max(maxGroup, h);
                minGroup = Math.max(minGroup, w);
            }
        }

        return maxGroup * minGroup;
    }

    public int solution01(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;

        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
        }

        for (int[] arr : sizes) {
            maxW = Math.max(maxW, arr[0]);
            maxH = Math.max(maxH, arr[1]);
        }


        return maxW * maxH;
    }

}

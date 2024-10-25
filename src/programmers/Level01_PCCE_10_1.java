package programmers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// [PCCE 기출문제] 10번 / 데이터 분석
// https://school.programmers.co.kr/learn/courses/30/lessons/250121
public class Level01_PCCE_10_1 {

    public static void main(String[] args) {
        int[][] answer = solution(new int[][]{{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}}, "date", 20300501, "remain");

        for (int[] arr : answer) {
            for (int a : arr) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }

    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<int[]> list = new ArrayList<>();
        int index_ext = getIndex(ext);
        int index_sort = getIndex(sort_by);

        for (int i = 0; i < data.length; i++) {
            if(data[i][index_ext] < val_ext) list.add(data[i]);
        }

        list.sort((o1, o2) -> {
            return o1[index_sort] - o2[index_sort];
        });

        return list.stream().map(arr -> Arrays.stream(arr).toArray()).toArray(int[][]::new);
    }

    private static int getIndex(String str) {
        switch (str) {
            case "code" -> {return 0;}
            case "date" -> {return 1;}
            case "maximum" -> {return 2;}
            case "remain" -> {return 3;}
            default -> {return -1;}
        }
    }

}

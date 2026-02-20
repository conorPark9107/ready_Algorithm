package programmers;

import java.util.Arrays;

public class Level01_K번째수 {


    public static void main(String[] args) {
        Level01_K번째수 o = new Level01_K번째수();
        int[] arr = o.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [5, 6, 3]
        System.out.println();
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        for (int[] command : commands) {
            int i = command[0];
            int j = command[1];
            int k = command[2];
            int[] sorted = new int[j - i + 1];
            System.arraycopy(array, i - 1, sorted, 0, sorted.length);
            Arrays.sort(sorted);
            answer[index++] = sorted[k - 1];
        }
        return answer;
    }

}

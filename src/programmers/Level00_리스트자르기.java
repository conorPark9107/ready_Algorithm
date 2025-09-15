package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Level00_리스트자르기 {

    public static void main(String[] args) {
        int[] arr = solution(3, new int[]{1, 5, 2}, new int []{1,2,3,4,5,6,7,8,9}); // [2, 3, 4, 5, 6]
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));

        System.out.println();
        System.out.println();

        arr = solution(4, new int[]{1, 5, 2}, new int []{1,2,3,4,5,6,7,8,9}); // [2, 4, 6]
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));

    }

    public static int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0, end = 0, step = 1;
        int a = slicer[0], b = slicer[1], c = slicer[2];
        switch (n) {
            case 1 -> end = b;
            case 2 -> { start = a; end = num_list.length - 1; }
            case 3 -> { start = a; end = b; }
            case 4 -> { start = a; end = b; step = c; }
        }

        for(int i = start; i <= end; i += step){
            list.add(num_list[i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution02(int n, int[] slicer, int[] num_list) {
        int start = 0,
            end = 0,
            step = 1;
        int a = slicer[0],
            b = slicer[1],
            c = slicer[2];

        switch (n) {
            case 1 -> end = b;
            case 2 -> { start = a; end = num_list.length - 1; }
            case 3 -> { start = a; end = b; }
            case 4 -> { start = a; end = b; step = c; }
        }

        int s = start, e = end, st = step;
        return IntStream.iterate(s, i -> i + st)
                .limit((e - s) / st + 1)
                .map(i -> num_list[i])
                .toArray();
    }

}

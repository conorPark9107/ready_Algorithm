package programmers;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class Level00_2의영역 {

    public static void main(String[] args) {
        int[] arr = solution(new int[]{1, 2, 1, 4, 5, 2, 9}); // 	[2, 1, 4, 5, 2]
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
        System.out.println();

        arr = solution(new int[]{1, 2, 1}); // 	[2]
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
        System.out.println();

        arr = solution(new int[]{1, 1, 1}); // 	[-1]
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
        System.out.println();

        arr = solution(new int[]{1, 2, 1, 2, 1, 10, 2, 1}); // 	[2, 1, 2, 1, 10, 2]
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
        System.out.println();

        arr = solution(new int[]{1, 1, 2, 2, 1, 10, 1, 2}); // 	[2, 2, 1, 10, 1, 2]
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
        System.out.println();
    }

    public static int[] solution(int[] arr) {
        int start = -1, end = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 2){
                if(start == -1) start = i;
                end = i;
            }
        }
        if(start == -1) return new int[]{-1};
        return Arrays.copyOfRange(arr, start, end + 1);
    }

    public static int[] solution03(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        int start = -1;
        int end = -1;
        for (int i = 0; i < arr.length; i++) {
            int s = arr[i];
            if(s == 2){
                start = i;
                end = arr.length - 1;
                while(start <= end){
                    if(arr[end] == 2) break;
                    end--;
                }
                break;
            }
        }

        if(start == -1) return new int[]{-1};
        for (int i = start; i <= end; i++) {
            list.add(arr[i]);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }



    public static int[] solution02(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        int start = -1;
        int end = -1;
        for (int i = 0; i < arr.length; i++) {
            int s = arr[i];
            int e = arr[arr.length - 1 - i];

            if(s == 2 && start == -1){
                start = i;
            }
            if(e == 2 && end == -1){
                end = arr.length - 1 - i;
            }
        }

        if(start == -1) return new int[]{-1};

        for (int i = start; i <= end; i++) {
            list.add(arr[i]);
        }


        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}

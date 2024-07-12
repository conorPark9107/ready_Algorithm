package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 대표값2
// https://www.acmicpc.net/problem/2587
public class Sort_2587 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            array[i] = Integer.parseInt(br.readLine());
            sum += array[i];
        }
        array = bubbleSort(array);

        System.out.println(sum / array.length);
        System.out.println(array[array.length / 2]);

    }

    // 버블 정렬
    private static int[] bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]){
                    array = swap(array, j);
                }
            }
        }

        return array;
    }

    private static int[] swap(int[] array, int j) {
        int temp = array[j];
        array[j] = array[j+1];
        array[j+1] = temp;
        return array;
    }

}

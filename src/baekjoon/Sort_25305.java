package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 커트라인
// https://www.acmicpc.net/problem/25305
public class Sort_25305 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sArr = br.readLine().split(" ");
        int N = Integer.parseInt(sArr[0]); // 응시자수
        int k = Integer.parseInt(sArr[1]); // 상을 받는 사람의 수.
        int[] array = new int[N];

        // 입력받기.
        String[] sArr1 = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(sArr1[i]);
        }

        // 정렬
        array = selectionSort(array);

        System.out.println(array[k-1]);

    }

    // 선택 정렬
    private static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i; j < array.length; j++) {
                if(array[j] > min){
                    min = array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = min;
        }
        return array;
    }
}
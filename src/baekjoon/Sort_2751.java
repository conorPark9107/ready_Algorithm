package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 수 정렬하기 2
// https://www.acmicpc.net/problem/2751
public class Sort_2751 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] array = new int[2000001];

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            int inputVal = Integer.parseInt(br.readLine());
            array[inputVal + 1000000] = 1;
        }

        for(int i=1; i<array.length; i++) {
            if(array[i] == 1) {
                sb.append(i - 1000000).append("\n");
            }
        }
        System.out.println(sb);
    }
}

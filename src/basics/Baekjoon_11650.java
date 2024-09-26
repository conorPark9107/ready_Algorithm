package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 좌표 정렬하기
// https://www.acmicpc.net/problem/11650
public class Baekjoon_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] xy = new int[n][2];
        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            xy[i][0] = Integer.parseInt(arr[0]);
            xy[i][1] = Integer.parseInt(arr[1]);
        }

        Arrays.sort(xy, (o1, o2) -> {
            if(o1[0] == o2[0]){
                return o1[1] - o2[1];
            }else{
                return  o1[0] - o2[0];
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < xy.length; i++) {
            for (int j = 0; j < 2; j++) {
                sb.append(xy[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}

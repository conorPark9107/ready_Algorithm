package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1904번 - 01타일
// https://www.acmicpc.net/problem/1904
public class Baekjoon_1904 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] arr = new long[1000000];
        arr[0] = 1; // 1
        arr[1] = 2; // 00, 11

        for(int i = 2; i < n; i++){
            arr[i] = (arr[i-1] + arr[i-2]) % 15746;
        }
        System.out.println(arr[n-1]);
    }

}

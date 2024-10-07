package basics;

import java.io.*;

// 피보나치수 5
// https://www.acmicpc.net/problem/10870
public class Baekjoon_10870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(n));
    }

    private static long fibonacci(int n){
        if(n < 2) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

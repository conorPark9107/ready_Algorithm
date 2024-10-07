package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 팩토리얼 2
// https://www.acmicpc.net/problem/27433
public class Baekjoon_27433 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(factorial(1, n));
    }

    private static long factorial(long result, int n) {
        if(n == 0) return result;
        return factorial(result * n, n - 1);
    }
}

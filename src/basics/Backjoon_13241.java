package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 최소공배수
// https://www.acmicpc.net/problem/13241
public class Backjoon_13241 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        long result = lcm(a, b);
        System.out.println(result);
    }

    private static long lcm(int a, int b) {
        return (long) a * b / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}

package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2 * n 타일링
// https://www.acmicpc.net/problem/11726
public class Baekjoon11726_실버3_2xn타일링 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 1;
        int b = n == 1 ? 1 : 2;
        for (int i = 3; i <= n; i++) {
            int c = (a + b) % 10007;
            a = b;
            b = c;
        }
        System.out.println(b);
    }

}

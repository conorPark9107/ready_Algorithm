package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 방번호
// https://www.acmicpc.net/problem/1475
public class Baekjoon1475_실버5_방번호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input);

        int[] count = new int[10];
        while (n > 0) {
            count[n % 10]++;
            n = n / 10;
        }

        int max = -1;
        int sub = (count[6] + count[9] + 1) / 2;
        count[6] = sub;
        count[9] = sub;
        for (int c : count) {
            max = Math.max(max, c);
        }

        System.out.println(max);
    }

}

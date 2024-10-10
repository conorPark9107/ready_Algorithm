package basics;

import java.io.*;


// 뒤집기
// https://www.acmicpc.net/problem/1439
public class Baekjoon_1439 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine()+ " ";

        int c0 = 0;
        int c1 = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) != s.charAt(i + 1)) {
                if(s.charAt(i) == '0') c0++;
                else c1++;
            }
        }

        System.out.println(Math.min(c0, c1));
    }
}

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 베라의 패션
// https://www.acmicpc.net/problem/15439
public class Baekjoon_15439 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(n * n - n);
    }
}

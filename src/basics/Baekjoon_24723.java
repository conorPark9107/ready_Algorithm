package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 녹색 거탑
// https://www.acmicpc.net/problem/24723
public class Baekjoon_24723 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println((int)Math.pow(2, n));
    }
}

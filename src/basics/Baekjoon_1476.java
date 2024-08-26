package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 날짜 계산
// https://www.acmicpc.net/problem/1476 
public class Baekjoon_1476 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int e = 0, s = 0, m = 0, year = 0;
        while (e != E || s != S || m != M) {
            year++;

            e = year % 15;
            s = year % 28;
            m = year % 19;
            if(e == 0) e = 15;
            if(s == 0) s = 28;
            if(m == 0) m = 19;
        }

        System.out.println(year);

    }
}
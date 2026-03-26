package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 달팽이는 올라가고 싶다.
// https://www.acmicpc.net/problem/2869
public class Baekjoon2869_브론즈1_달팽이는_올라가고_싶다 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int day = (v - a) / (a - b);
        if ((v - a) % (a - b) != 0) {
            day++;
        }
        day++;
        System.out.println(day);
    }


}


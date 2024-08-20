package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 대지
// N개의 점이 주어졌을때 N개를 모두 포함하는 최소의 사각형을 그리시오.
// https://www.acmicpc.net/problem/9063
public class Backjoon_9063 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int minX = 10001;
        int maxX = -10001;
        int minY = 10001;
        int maxY = -10001;

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");

            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);

            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);

            minY = Math.min(minY, y);
            maxY = Math.max(maxY, y);
        }

        System.out.println( (maxX - minX) * (maxY - minY) );
    }

}
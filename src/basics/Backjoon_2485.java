package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 가로수
// https://www.acmicpc.net/problem/2485
public class Backjoon_2485 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] amongTrees = new int[n - 1];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < n - 1; i++) {
            amongTrees[i] = arr[i+1] - arr[i];
        }

        int sum = 0;
        int gcde = amongTrees[0];
        for (int i = 0; i < amongTrees.length; i++) {
            gcde = gcd(gcde, amongTrees[i]);
            sum += amongTrees[i];
        }

        int result = sum / gcde - amongTrees.length;
        System.out.println(result);

    }

    private static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }


}

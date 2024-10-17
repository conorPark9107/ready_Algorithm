package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_24416 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int answerRecursion = recursion(n, 0);
        int answerDP = dp(n);
        System.out.println(answerRecursion + " " + answerDP);

    }

    private static int dp(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;

        int count = 0;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            count++;
        }

        return count;
    }

    private static int recursion(int n, int count) {
        if(n == 1 || n == 2) {
            n = 1;
            return count + 1;
        }
        return recursion(n - 1, count) + recursion(n - 2, count);
    }

}

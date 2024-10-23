package basics;

import java.util.Scanner;

public class Baekjoon_11659 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] sum = new int[n + 1];
        sum[0] = 0;
        for (int x = 1; x <= n; x++) {
            sum[x] = sum[x-1] + arr[x-1];
        }

        StringBuilder sb = new StringBuilder();
        for (int x = 0; x < m; x++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            sb.append(sum[j] - sum[i - 1]);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
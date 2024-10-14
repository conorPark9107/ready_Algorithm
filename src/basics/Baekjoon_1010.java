package basics;

import java.io.*;

public class Baekjoon_1010 {

    public static int[][] memo = new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){
            String[] in = br.readLine().split(" ");
            int n = Integer.parseInt(in[0]);
            int m = Integer.parseInt(in[1]);
            bw.write(recursion(n, m) + "\n");
        }

        bw.flush();
    }

    private static int recursion(int n, int m) {
        if(memo[n][m] != 0) return memo[n][m];
        if(n == 1) return m;
        if(n == m) return 1;
        return memo[n][m] = recursion(n, m - 1) + recursion(n - 1, m - 1);
    }

}

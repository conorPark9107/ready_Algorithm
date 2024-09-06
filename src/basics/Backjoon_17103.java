package basics;

import java.io.*;

// 골드바흐 파티션
// https://www.acmicpc.net/problem/17103
public class Backjoon_17103 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        boolean[] isPrime = new boolean[1000001];
        for(int i = 2; i < isPrime.length; i++){
            if(!isPrime[i]){
                for (int j = i + i; j < isPrime.length; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;

            for (int x = 2; x <= n / 2; x++) {
                if(!isPrime[x] && !isPrime[n-x]){
                    count++;
                }
            }

            bw.write(count + "\n");
        }


        br.close();
        bw.flush();
        bw.close();
    }

}
